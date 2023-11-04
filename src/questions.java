import java.util.Random;
import java.util.Scanner;

public class questions {
    public static void main(String[] args){
            rand();
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
            int sum = 0;
            System.out.print("enter the number --> ");
            int check = input.nextInt();
            while (check>0){
                int temp = check;
                int remainder = temp % 10;
                sum = (sum * 10) + remainder;
                check = check/10;
            
            }
            
            System.out.println(sum);

            /*  HOW TO SOLVE PALINDROME CHECKER QUESTION

             * FIRST WE TAKE IN THE INPUT FROM USER FOR A RANDOM NUMBER IN A VARIABLE 'N'
             * THEN, WE START A WHILE LOOP WHERE WE SET N IS GREATER THAN 0
             * WE PUT N IN A TEMPORARY VARIABLE
             * WE SET UP A VARIABLE 'SUM', 'REMAINDER'
             * SET SUM AS 0 AS IT WILL ADD UP N FROM ITS LAST NUMBER TO FIRST (WILL KEEP CONCATANATING THEM)
             * IN REMAINDER WE DIVIDE TEMP WITH 10 AND STORE ITS REMAINDER. EG: N = 454; REMAINDER = 454 % 10 = 4
             * THEN WE ADD THIS REMAINDER VALUE TO SUM, WE USE THE FORMULA: sum = (sum*10) + remainder
             * WE KEEP DIVIDING THE N VARIABLE BY 10 TO KEEP IT REDUCING TILL LOOP STOPS
             * IN THE END PRINT OUT 'SUM'
             * 
             * 
             * 
             * AN EXAMPLE HOW THIS WORKS:
             * 
             * FIRST ITERATION:
             * 
             * N = 454;
             * SUM = 0;
             * LOOP STARTS:
             * TEMP = 454;
             * REMAINDER = TEMP % 10 = 45;
             * SUM = (sum * 10) + remainder = 4
             * N = N/10 = 45
             * 
             * SECOND ITERATION:
             * N = 45;
             * SUM = 4;
             * LOOP CONTINUES:
             * TEMP = 45;
             * REMAINDER = TEMP % 10 = 5;
             * SUM = (SUM * 10) + REMAINDER = 4 * 10 + 5 = 45;
             * N = N/10 = 4;
             * 
             * LAST ITERATION:
             * N = 4;
             * SUM = 45;
             * LOOP CONTINUES:
             * TEMP = 4;
             * REMAINDER = TEMP % 10 = 4;
             * SUM = (SUM * 10) + REMAINDER = 45 * 10 + 4 = 454;
             * N = N/10 = 0;
             * 
             * LOOP TERMINATED
             * System.out.println(SUM);
             * SUM = 454.
             * 
             */
            
        }

        private static void rand(){
            Random rand = new Random();
            Scanner inp = new Scanner(System.in);
            System.out.println("enter the max value of your random generator: ");
            int container = inp.nextInt();
            container = rand.nextInt(container);
            System.out.println(container);



        }

        
}
