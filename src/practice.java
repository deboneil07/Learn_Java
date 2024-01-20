// import java.util.ArrayList;
public class practice {
    public static void main(String[] args){
        int n = 10;
        int i = 1;
        func(i, n);

    }

    static void func(int i, int n){
        if (i > n){
            System.out.println(" done");
        }
        else{
            System.out.println(i);
            func(i+1, n);
        }
    }
}
