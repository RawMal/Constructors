import java.util.Random;

public class Customer {

    int id;
    String firstName;
    String lastName;
    double heldMoney;

    Random random = new Random();

    public Customer(int id, String firstName, String lastName, double heldMoney) {
        this.id = (int) random.nextInt(500);
        this.firstName = firstName;
        this.lastName = lastName;
        this.heldMoney = heldMoney;
    }

    // Customer getters + setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getfirstName() {
        return firstName = firstName;
    }
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getlastName() {
        return lastName = lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }


    public double getHeldMoney()  {
     return heldMoney = heldMoney;
    }
    public void setHeldMoney(double heldMoney) {
        this.heldMoney = heldMoney;
    }

    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName +
                ", lastName='" + lastName +
                ", heldMoney=" + heldMoney +
                '}';
    }




}
