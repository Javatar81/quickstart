package org.jboss.as.quickstarts.kitchensink.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.jboss.as.quickstarts.kitchensink.model.Member;
import org.jboss.as.quickstarts.kitchensink.service.MemberRegistration;

@MessageDriven(name = "MemberTopicMDB", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/kitchensink"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
public class MemberMdb implements MessageListener {

	@Inject
    private MemberRegistration memberRegistration;
	
	@Override
	public void onMessage(Message message) {
		ObjectMessage msg = null;
        try {
            if (message instanceof ObjectMessage) {
                msg = (ObjectMessage) message;
                System.out.println("Received Message from topic: " + msg.getObject());
                memberRegistration.register((Member) msg.getObject());
            } else {
                System.out.println("Message of wrong type: " + message.getClass().getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
	}

}
