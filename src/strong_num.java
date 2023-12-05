import java.util.Scanner;
public class strong_num{
    public static void main(String[] args){
        int n;

        Scanner x = new Scanner(System.in);
        System.out.println("enter the number: ");
        n = x.nextInt();

        if (strong(n) == true){
            System.out.println(n + " is the number!");

        }
        else{
            System.out.println(n + " is not the number! :( ");
        }

    }

    static int fact(int num){
        int fac = 1;
        while (num != 0){
            fac = fac * num;
            num--;
        }
        return fac;
    }

    static boolean strong(int num){
        int temp = num;

        int sum = 0;
        while(temp != 0){
            sum = sum + fact(temp % 10);
            temp /= 10;

        }

        if (sum == num){
            return true;
        }
        else{
            return false;
        }

    }


}
