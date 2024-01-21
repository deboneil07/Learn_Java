import java.util.*;

public class practice {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 3, 4, 4, 4, 4, 5, 6, 6, 8 };
        func(list);

    }

    static void func(int[] n) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int max_check = 0;
        for (int i : n) {
            hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
        }

        for (int i : hashmap.values()) {

            if (i > max_check) {
                max_check = i;

            }

        }
        System.out.println(hashmap);
        System.out.println(max_check);
       
    }
}