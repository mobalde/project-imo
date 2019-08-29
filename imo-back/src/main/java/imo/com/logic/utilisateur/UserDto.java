/**
 * 
 */
package imo.com.logic.utilisateur;

import java.util.ArrayList;
import java.util.List;

import imo.com.model.utilisateur.RoleUserEnum;

/**
 * @author mbalde
 *
 */
public abstract class UserDto {

	/** email */
	private String email;

	/** password */
	private String password;

	/** Role utilisateur */
	private List<RoleUserEnum> roles = new ArrayList<>();

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the roles
	 */
	public List<RoleUserEnum> getRoles() {
		return roles;
	}

	/**
	 * @param email
	 *              the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param password
	 *                 the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<RoleUserEnum> roles) {
		this.roles = roles;
	}
}
