package org.jboss.as.quickstarts.kitchensink.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jboss.as.quickstarts.kitchensink.data.MemberRepository;
import org.jboss.as.quickstarts.kitchensink.model.Member;
import org.jboss.as.quickstarts.kitchensink.service.MemberRegistration;

@WebService
public class MemberWebService {
	@Inject
	MemberRegistration registration;
	
	@Inject
    MemberRepository repository;
	
	@WebMethod
	public void createMember(Member member) throws Exception {
		registration.register(member);
	}
	
	@WebMethod
	public List<Member> getAllMembers() throws Exception {
		return repository.findAllOrderedByLastName();
	}
}
