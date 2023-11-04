import java.util.Scanner;

public class index {
    public static void main(String[] args){
            palindrome();
    }

    private static void fibonacii(){
        int x = 0, y = 1, total, i = 0;
        while ( i < 10){
            total = x + y;
            x = y;
            y = total;
            i++;
            System.out.println(total);
        }
        
        }

        private static void prime(){
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the number: ");
            int number = scan.nextInt();

            if (number%2!=0 && number%3!=0){
                System.out.println("this is prime");
            }
            else{
                System.out.println("this is not prime!");
            }
        }

        public static void palindrome(){
            Scanner input = new Scanner(System.in);
            System.out.print("enter the number --> ");
            int check = input.nextInt();
            System.out.println(check);
            
            
        }

        
}
