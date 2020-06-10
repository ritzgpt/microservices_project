package in.cloudconfigconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileConfiguration {

	@Autowired
	Environment environment;
	
	public String getDefaultModel(){
		return environment.getProperty("vehicle.default.model");
	}
	
	public String getMinRentPeriod(){
		return environment.getProperty("member.rent.min");
	}
	
	public String getMaxRentPeriod(){
		return environment.getProperty("member.rent.max");
	}
	
	public String getServiceGreetings(){
		return environment.getProperty("service.greeting");
	}
}
