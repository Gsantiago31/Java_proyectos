
package Clases;


public class ClsPerson {
    private String name;
    private String lastName;
    private String ID;
    private String email;

    public ClsPerson(){}
    public ClsPerson(String name, String lastName, String ID, String email) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
    
    
}
