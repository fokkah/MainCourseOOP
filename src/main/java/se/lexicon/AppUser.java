package se.lexicon;

public class AppUser {


    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //-------------------------------------- Fields -------------------------------------------------------

    private String username;
    private String password;
    private Enum role;

    //-------------------------------------- Fields END-------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //------------------------- Constructors -----------------------------------------------------------

    public void userInfo(String username, String password){
        this.username = username;
        this.password = password;
    }

    public AppUser(Enum role) {
        this.role = role;
    }

    //------------------------- Constructors END -----------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------- SETTERS -------------------------------------------------------------------------


    public void setUsername(String username) {
        this.username = username;
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("username should not be null or empty");

        }
    }

    public void setPassword(String password) {
        this.password = password;
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("password should not be null or empty");

        }
    }

    public void setRole(Enum role) {
        this.role = role;
        if (role == null || role.toString().trim().isEmpty()) {
            throw new IllegalArgumentException("Cannot be null or empty");

        }
    }

    //----------------------- SETTERS END -----------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //----------------------- GETTERS ---------------------------------------------------------------------

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Enum getRole() {
        return role;
    }





//----------------------- GETTERS END-----------------------------------------------------------------


}











