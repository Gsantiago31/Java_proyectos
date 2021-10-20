
package Clases;


public class ClsEmployes extends ClsPerson {
    private float salary;
    private String category;

    public ClsEmployes(){}
    public ClsEmployes(float salary, String category, String name, String lastName, String ID, String email) {
        super(name, lastName, ID, email);
        this.salary = salary;
        this.category = category;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
    
    
    public void employeName(){
        System.out.println("El empleado " + getName() + " trabaja como " + getCategory());
    }
    

    
    
    
    
    
    
    
    
}
