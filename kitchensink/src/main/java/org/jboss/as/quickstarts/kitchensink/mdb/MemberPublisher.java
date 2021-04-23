package org.jboss.as.quickstarts.kitchensink.mdb;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.JMSContext;
import javax.jms.Topic;

import org.jboss.as.quickstarts.kitchensink.model.Member;

@Named
public class MemberPublisher {
	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/topic/kitchensink")
    private Topic topic;
	
	public void publish(Member newMember) {
	        System.out.println("Init");
	        context.createProducer().send(topic, newMember);
	        System.out.println("sent");

	}

}
