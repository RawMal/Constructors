public class Customer_Ex {

    private int id;

    private String firstName;

    private String lastName;

    public Customer_Ex(int id, String firstName, String lastName) {
        // Generate a random number for ID
        this.id = (int) (Math.random()*5000 +1);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // add getters and setters
    public int getId() {return id;}





}
