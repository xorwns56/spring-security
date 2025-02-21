package com.example.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@GetMapping("/")
	public String login() {
		return "<h1>Welcome to Home Page</h1><a href='/oauth2/authorization/naver'>Login with Naver</a>";
	}
}
