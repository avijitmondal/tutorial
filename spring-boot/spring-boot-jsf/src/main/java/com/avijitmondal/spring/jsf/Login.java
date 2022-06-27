package com.avijitmondal.spring.jsf;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
public class Login {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String showGreeting() {
		return "Hello " + username + "!";
	}

	public void login() {

		FacesContext context = FacesContext.getCurrentInstance();

		if ((username.equals("admin") && password.equals("admin"))
				|| (username.equals("user") && password.equals("user"))) {
			context.getExternalContext().getSessionMap().put("user", username);
			try {
				context.getExternalContext().redirect("index.xhtml");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			context.addMessage(null, new FacesMessage("Authentication Failed. Check username or password."));
		}
	}

	public void logout() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().invalidateSession();
		try {
			context.getExternalContext().redirect("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
