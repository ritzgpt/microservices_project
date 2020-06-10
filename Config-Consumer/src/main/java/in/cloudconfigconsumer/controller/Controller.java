package in.cloudconfigconsumer.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.cloudconfigconsumer.model.MemberProfileConfiguration;

@RestController
public class Controller {

	@Autowired
	MemberProfileConfiguration memberProfileConfiguration;
	
	@RequestMapping(value="/profile",method=RequestMethod.GET)
	public MemberProfileConfiguration getConfig(){
		return memberProfileConfiguration;
	}
}
