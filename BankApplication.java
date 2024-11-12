import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to my bank application!");

        Account[] accounts = {new Account(), new Account()};

        while(true) {

            System.out.println("Menu: "); 
            System.out.println("1) Get balance on account"); 
            System.out.println("2) Make deposit to account"); 
            System.out.println("3) Make withdrawl on account"); 
            System.out.println("..."); 
            System.out.println("9) Quit"); 

            String choice = input.nextLine();
            String line = "";
            switch(choice) {
                case "1":{
                    try {
                      System.out.print("Enter Account Number: ");
                      line = input.nextLine();
                      int id = Integer.parseInt(line);
                      if(id < 0 || id >=  accounts.length) throw new NumberFormatException();
                      System.out.printf("Balance: %f%n",
                                      accounts[id].getBalance());
                    } catch(NumberFormatException e) {
                        System.out.println("Invalid input");
                    }
                    break;
                }case "2":{
                    try {
                      System.out.print("Enter Account Number: ");
                      line = input.nextLine();
                      int id = Integer.parseInt(line);
                      if(id < 0 || id >=  accounts.length) throw new NumberFormatException();
                      System.out.print("Enter Amount: ");
                      line = input.nextLine();
                      double amount = Double.parseDouble(line);
                      if(amount <= 0) 
                        throw new NumberFormatException();
                      accounts[id].deposit(amount);
                    } catch(NumberFormatException e) {
                        System.out.println("Invalid ID number");
                    }
                    break;
                }case "3":{
                    try {
                      System.out.print("Enter Account Number: ");
                      line = input.nextLine();
                      int id = Integer.parseInt(line);
                      if(id < 0 || id >=  accounts.length) throw new NumberFormatException();
                      System.out.print("Enter Amount: ");
                      line = input.nextLine();
                      double amount = Double.parseDouble(line);
                      if(amount <= 0) 
                        throw new NumberFormatException();
                      
                      accounts[id].withdrawl(amount);
                    } catch(NumberFormatException e) {
                        System.out.println("Invalid input");
                    }
                    break;

                }case "9":
                    System.out.println("Thank you for using this program!!!");
                    System.exit(1);

                default:
                    System.out.println("Invalid option, try again!");
                    break;
            }
        }
    }
}

