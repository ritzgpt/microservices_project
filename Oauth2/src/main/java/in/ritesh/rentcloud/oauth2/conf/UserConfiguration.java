package in.ritesh.rentcloud.oauth2.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {
	
	PasswordEncoder passwordEncoder=PasswordEncoderFactories.createDelegatingPasswordEncoder();
	
	@Override
	public void init(AuthenticationManagerBuilder user) throws Exception {
		user.inMemoryAuthentication().withUser("usha").password(passwordEncoder.encode("usha")).roles("ADMIN","USER").authorities("CAN_READ","CAN_WRITE","CAN_DELETE").and()
		.withUser("ashok").password(passwordEncoder.encode("ashok")).roles("USER").authorities("CAN_READ","CAN_DELETE");
	}

}
