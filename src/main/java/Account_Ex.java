public class Account_Ex {

    String id;
    Customer_Ex accOwner;
    int accBalance;

    public Account_Ex(String id, Customer_Ex accOwner, int accBalance) {
        this.id = id;
        this.accOwner = accOwner;
        this.accBalance = accBalance;
    }

    //add getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer_Ex getAccOwner() {
        return accOwner;
    }

    public void setAccOwner(Customer_Ex accOwner) {
        this.accOwner = accOwner;
    }

    public int getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    //Adding method to add and reduce from balance of created account for while loop
    //Add balance
    public void addAccBalance(int toAdd) {
        setAccBalance(accBalance + toAdd);
    }

    //deduct balance
    public void subtractAccBalance(int toSubtract) {
        setAccBalance(accBalance - toSubtract);
    }

    //Add override
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", Name=' " + accOwner +
                ", Account Balance='" + accBalance +
                '}';


    }
}
