import java.util.Scanner ;

public class atm {
    public static void main(String[] args){
        atm();
    }

    private static void atm(){
        int balance = 1000, withdraw, deposit;

        Scanner inp = new Scanner(System.in);

        while(true){
            System.out.println("Welcome to SBI ATM");
            System.out.println("Press 1 to check balance");
            System.out.println("Press 2 to deposit");
            System.out.println("Press 3 to withdraw");
            System.out.println("Press 4 to exit");

            int choice = inp.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 2:
                    System.out.println("Enter the amount that you want to deposit");
                    deposit = inp.nextInt();
                    balance += deposit;
                    break;
                case 3:
                    System.out.println("Enter the amount you want to withdraw");
                    withdraw = inp.nextInt();
                    if (withdraw > balance){
                        System.out.println("Error, withdraw amount exceeded!");
                    }
                    else{
                        balance -= withdraw;
                    }
                    break;
                case 4:
                System.out.println("Thanks for using SBI ATM, Have a great day! ");
                    System.exit(0);

                default:
                    break;
            }
        }
    }
}
