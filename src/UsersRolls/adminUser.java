package UsersRolls;

public class adminUser {

    private static String Email;
    private static String FirstName;
    private static String LastName;
    private static String Mobile;

    public adminUser() {

    }

    public adminUser(String email, String fname, String lname, String mobile) {
        this.Email = email;
        this.FirstName = fname;
        this.LastName = lname;
        this.Mobile = mobile;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String Email) {
        adminUser.Email = Email;
    }

    public static String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public  static void setFirstName(String FirstName) {
        adminUser.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public static String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public static void setLastName(String LastName) {
        adminUser.LastName = LastName;
    }

    /**
     * @return the Mobile
     */
    public static String getMobile() {
        return Mobile;
    }

    /**
     * @param Mobile the Mobile to set
     */
    public static void setMobile(String Mobile) {
        adminUser.Mobile = Mobile;
    }

}
