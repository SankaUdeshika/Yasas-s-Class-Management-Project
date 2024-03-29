package UsersRolls;

public class adminUser {

    private String Email;
    private String Password;
    private String FirstName;
    private String LastName;
    private String Mobile;

    public adminUser(String email, String password, String fname, String lname, String mobile) {
        this.Email = email;
        this.Password = password;
        this.FirstName = fname;
        this.LastName = lname;
        this.Mobile = mobile;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the Mobile
     */
    public String getMobile() {
        return Mobile;
    }

    /**
     * @param Mobile the Mobile to set
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

}
