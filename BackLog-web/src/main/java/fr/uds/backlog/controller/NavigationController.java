package fr.uds.backlog.controller;

import javax.enterprise.inject.Model;


@Model
public class NavigationController {


	private static final String REGISTRATION_URL = "register";
	private static final String LOGIN_URL = "login";
	private static final String ALL_MEMBERS_URL = "view-all-members";
	
	public String moveToRegistration(){
		return NavigationController.REGISTRATION_URL;
	}
	

	public String moveToLogin(){
		return NavigationController.LOGIN_URL;
	}
	
	public String moveToViewAllMembers(){
		return NavigationController.ALL_MEMBERS_URL;
	}
}
