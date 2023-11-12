package com.arc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserDetailsController {

	@Value("${dburl}")
	private String url;
	@Value("${username}")
	private String username;
	@Value("${password}")
	private String password;

	@GetMapping("/user")
	public String getUserDetails() {

		
		return "DB details are -> Url is :: "+url+" username is :: "+username+" password is :: "+password;
	}
}
