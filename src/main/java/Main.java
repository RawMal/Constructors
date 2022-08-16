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

        //For the Circle
        Circle myCircle = new Circle(2);
        double myRadius = myCircle.getRadius();
        double myCircumference = myCircle.getCircumference();
        System.out.println("The Circle's Radius is: "+ myCircle.getRadius());
        System.out.println("The Circle's Circumference is: "+ myCircle.getCircumference());

        //New radius value experiment
        myCircle.setRadius(18);
        System.out.println("The Circle's Radius is: "+ myCircle.getRadius());
        System.out.println("The Circle's Circumference is: "+ myCircle.getCircumference());








    }
}
