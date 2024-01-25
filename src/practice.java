import java.util.*;

public class practice {
    public static void main(String[] args) {
        int[] list = { 7,4,9,90,3,24,66,323,1 };
        int n = list.length;
        checkIfSorted(list, n);
        
        
    }

    // static void func(int[] n) {
    //     HashMap<Integer, Integer> hashmap = new HashMap<>();
    //     int max_check = 0;
    //     for (int i : n) {
    //         hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
    //     }

    //     for (int i : hashmap.values()) {

    //         if (i > max_check) {
    //             max_check = i;

    //         }

    //     }
    //     System.out.println(hashmap);
    //     System.out.println(max_check);
       
    // }

        // public static void selectionSort(int arr[], int n){
        //     for (int i = 0; i < n - 1; i++){
        //         int load = i;

        //         for (int j = i + 1; j < n; j++){
        //             if (arr[j] < arr[load]){
        //                 load = j;
        //             }
        //         }

        //         int temp = arr[load];
        //         arr[load] = arr[i];
        //         arr[i] = temp;
        //     }

        //     for (int i : arr){
        //         System.out.println(i);
        //     }
        // }

        // public static void bubbleSort(int arr[], int n){
        //     for (int i = n-1; i >= 0; i--){
        //         for (int j = 0; j < i; j++){
        //             if (arr[j] > arr[j+1]){
        //                 int temp = arr[j];
        //                 arr[j] = arr[j+1];
        //                 arr[j+1] = temp;

        //             }
        //         }
        //     }

        //     for (int value = 0; value < n; value++){
        //         System.out.println(arr[value]);
        //     }
        // }

        // public static void insertionSorting(int arr[], int n){
        //     for (int i = 0; i <= n - 1; i++){
        //         int j = i;
        //         while (j > 0 && arr[j] < arr[j - 1]){
        //             int temp = arr[j - 1];
        //             arr[j-1] = arr[j];
        //             arr[j] = temp;
        //             j--;
        //         }
        //     }

        //     for (int i = 0; i < n; i++){
        //         System.out.println(arr[i]);
        //     }
        // }

        // public static void findHighest(int arr[], int n){
        //     int check = arr[0];
        //     for (int i = 0; i < n; i++){
        //         if (arr[i] > check){
        //             check = arr[i];
        //         }
        //     }
        //     System.out.println(check);
        // }

        // public static void findSecondHighest(int arr[], int n){
        //     int current = arr[0];
        //     int previous = 0;

        //     for (int i = 0; i < n; i++){
        //         if (arr[i] > current) {
        //             previous = current;
        //             current = arr[i];
        //         }
        //     }
        //     System.out.println(previous);

        // }


        public static void checkIfSorted(int arr[], int n){
            int[] original_copy = Arrays.copyOf(arr, n);
            for (int i = 0; i < n-1; i++){
                int mini = i;
                for (int j = i + 1; j<n; j++){
                    if (arr[j] < arr[mini]){
                        int temp = arr[j];
                        arr[j] = arr[mini];
                        arr[mini] = temp;
                    }
                }
            }

            // for (int i = 0; i < n; i++) {
            //     System.out.println(original_copy[i]);

            // }
            
            // for (int i = 0; i < n; i++) {
            //     System.out.println(arr[i]);
            // }
            

            if (original_copy == arr){
                System.out.println("That is true!");
            }
            else{
                System.out.println("False!! ");
            }

        }


}