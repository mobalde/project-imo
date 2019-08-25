/**
 * 
 */
package imo.com.logic.utilisateur;

/**
 * @author mbalde
 *
 */
public abstract class UserDto {

    /** email */
    private String email;

    /** password */
    private String password;

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

}
