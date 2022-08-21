import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //import scanner for tying customer to account
        Scanner scanner = new Scanner(System.in);


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

        //Time to check
        System.out.println("The rectangle's perimeter = "+ myRectangle.getPerimeter());
        System.out.println("The rectangle's area = "+ myRectangle.getArea());
        System.out.println("The rectangle's Diagonal = "+ myRectangle.getDiagonal());

        //For the Customer
        Customer lloyd = new Customer("Lloyd", "Banks", 1200);
        System.out.println(" Full Name: "+lloyd.getfirstLastName() );
        System.out.println(" Account Balance: "+lloyd.getHeldMoney());

        //time to check
        lloyd.subtractHeldMoney(350);
        System.out.println("Account Balance after withdrawal :"+lloyd.getHeldMoney());
        System.out.println("Account ID request: "+lloyd.getId());



        //Tying Account to Customer// Allowing user input
        System.out.println("Please enter your Customer's first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your Customer's last name: ");
        String lastName = scanner.nextLine();

        Customer_Ex newCustomer = new Customer_Ex(firstName,lastName);

        System.out.println(newCustomer.toString());

        //Creating new customer account
        Account_Ex newAccount = new Account_Ex("1",newCustomer,600);

        System.out.println("New account created: ");
        System.out.println(newAccount);

        //Adding While loop to add and subtract from balance
        Boolean appOperating = true;

        while (appOperating){
            System.out.println("How can we help? Would you like to DEPOSIT/TRANSFER/EXIT ?");
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "exit": {
                    appOperating = false;
                    break;
                }
                case "deposit": {
                    System.out.println("How much would you like to deposit into your account?");
                    if (scanner.hasNextInt()) {
                        int toAdd = scanner.nextInt();
                        scanner.nextLine();
                        newAccount.addAccBalance(toAdd);
                        System.out.println("Your new account balance is: " + newAccount.getAccBalance());
                    } else {
                        //Correcting user if they add a string value/type words instead of numbers
                        System.out.println("Please input a valid number");
                    }
                    break;
                }
                case "transfer": {
                    System.out.println("How much would you like to transfer from your account?");
                    if (scanner.hasNextInt()) {
                        int toSubtract = scanner.nextInt();
                        scanner.nextLine();
                        newAccount.subtractAccBalance(toSubtract);
                        System.out.println("Your new account balance is: " + newAccount.getAccBalance());
                    } else {
                        System.out.println("Please input a valid number");
                    }
                    break;
                }
            }
        }












    }
    }
