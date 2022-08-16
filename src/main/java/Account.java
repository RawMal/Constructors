public class Account {
    String ID;
    String Name;
    int Balance;

    public Account(String ID, String Name, int Balance) {
        this.ID = ID;
        this.Name = Name;
        this.Balance = Balance;

    }

    //Create Methods
    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getBalance() {
        return Balance;
    }


    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

// Over riding the toString() method
@Override
public String toString() {
    return "Account{" + "ID='" + ID + ", Name ='" + Name + ", Balance=" + Balance + '}';
}

}
