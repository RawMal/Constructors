public class Main {
    public static void main(String[] args) {


        Account myAccount = new Account("1", "Bond", 700);
        String myId = myAccount.getID();
        String myName = myAccount.getName();
        int myBalance = myAccount.getBalance();

        System.out.println(myAccount);
        System.out.println(myAccount.getID());
        System.out.println(myAccount.getName());
        System.out.println(myAccount.getBalance());





    }
}
