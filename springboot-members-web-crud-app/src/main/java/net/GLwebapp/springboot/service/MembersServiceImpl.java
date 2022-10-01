 package net.GLwebapp.springboot.service;
 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

import net.GLwebapp.springboot.Members;
import net.GLwebapp.springboot.repository.MemberRepository;
 @Service 
public class MembersServiceImpl implements MembersService{

	@Autowired
	   private MemberRepository memberRepository;
	
   @Override
   public List<Members>getAllMembers(){
	   
	   return memberRepository.findAll();
   }

}
