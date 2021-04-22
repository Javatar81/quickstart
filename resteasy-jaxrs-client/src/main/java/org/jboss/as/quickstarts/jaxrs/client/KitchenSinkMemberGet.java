package org.jboss.as.quickstarts.jaxrs.client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

public class KitchenSinkMemberGet {
	public static void main(String[] args) {
		ResteasyClient client = new ResteasyClientBuilder().build();

        // Set url as target
        ResteasyWebTarget target = client.target("http://localhost:8080/kitchensink/rest/members/0");

        // Be sure to set the mediatype of the request
        target.request(MediaType.APPLICATION_JSON);

        // Request has been made, now let's get the response
        Response response = target.request().get();
        String result = response.readEntity(String.class);
        System.out.println(result);
        response = target.request().get();
        Member member = response.readEntity(Member.class);
        System.out.println(member.getEmail());
        response.close();
	}
}
