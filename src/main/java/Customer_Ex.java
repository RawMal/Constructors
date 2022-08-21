public class Customer_Ex {

    private int id;

    private String firstName;

    private String lastName;

    public Customer_Ex(String firstName, String lastName) {
        // Generate a random number for ID
        this.id = (int) (Math.random()*5000 +1);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // add getters and setters
    public int getId() {return id;}
    public void setId(int id) {this.id=id;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName=firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName=lastName;}

    //Add override
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName=' " + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';

    }





}
