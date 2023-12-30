import java.util.Scanner;

public class q1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isArmstrong(n));
        

    }   
    
//     static boolean isPrime(int n){
//         if (n <= 1){
//             return false;
//         } 
//         int m = 2;
//         while ( m * m <= n ){
//             if (n % m == 0){
//                 return false;
//             }
//             m++;
//         }
//         if (m * m > n){
//             return true;
    
//     }
//     else{
//         return false;
//     }
// }
    
    static boolean isArmstrong(int n){
        //153
        int original = n;
        int total = 0;
        
        while (n > 0){
            int temp = n % 10;
            total += temp * temp * temp;
            n = n / 10;
        }

        if (original == total){
            return true;

        }
        else{
            return false;
        }     
    }



}
