import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to my bank application!");


        while(true) {

            System.out.println("Menu: "); 
            System.out.println("1) Get balance on account"); 
            System.out.println("2) Make deposit to account"); 
            System.out.println("3) Make withdrawl on account"); 
            System.out.println("..."); 
            System.out.println("9) Quit"); 

            int choice = input.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Not yet implemented");
                    break;
                case 2:
                    System.out.println("Not yet implemented");
                    break;
                case 3:
                    System.out.println("Not yet implemented");
                    break;

                case 9:
                    System.out.println("Thank you for using this program!!!");
                    System.exit(1);

                default:
                    System.out.println("Invalid option, try again!");
                    break;
            }
        }
    }
}
root@fedor
