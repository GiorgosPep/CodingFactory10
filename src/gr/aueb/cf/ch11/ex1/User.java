package gr.aueb.cf.ch11.ex1;

public class User {

    private long id;
    private String firstname;
    private String lastname;


    public User() {

    }

    public User(long id, String firstname, String lastname) {
        this.firstname = firstname;
        this.id = id;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
