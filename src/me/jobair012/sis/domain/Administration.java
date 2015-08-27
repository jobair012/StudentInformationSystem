package me.jobair012.sis.domain;

import org.springframework.stereotype.Component;

@Component
public class Administration {

	private int adminId;
	private String userName;
	private String password;
	private boolean enabled;
	private String role;

	public Administration() {

	}

	public Administration(int adminId, String userName, String password,
			boolean enabled, String role) {
		
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
		this.role = role;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
