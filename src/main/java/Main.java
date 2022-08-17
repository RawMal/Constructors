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


        //For the Rectangle
        Rectangle myRectangle = new Rectangle(40, 20);
        float myPerimeter = myRectangle.getPerimeter();
        float myArea = myRectangle.getArea();
        float myDiagonal = myRectangle.getDiagonal();

        //Time to test
        System.out.println("The rectangle's perimeter = "+ myRectangle.getPerimeter());
        System.out.println("The rectangle's area = "+ myRectangle.getArea());
        System.out.println("The rectangle's Diagonal = "+ myRectangle.getDiagonal());

        //For the Customer
        Customer lloyd = new Customer("Lloyd", "Banks", 1200);
        System.out.println(" Full Name: "+lloyd.getfirstLastName() );
        System.out.println(" Account Balance: "+lloyd.getHeldMoney());

        //time to test
        











    }
}
