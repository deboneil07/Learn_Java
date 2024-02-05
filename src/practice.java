import java.util.*;

public class practice {
    public static void main(String[] args) {
        int[] list = { 6,8,2,4,3,9,4,7,5,1,57,9,52 };
        int n = list.length;
        
        
        
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


        // public static void checkIfSorted(int arr[], int n){
        //     int[] original_copy = Arrays.copyOf(arr, n);
        //     for (int i = 0; i < n-1; i++){
        //         int mini = i;
        //         for (int j = i + 1; j<n; j++){
        //             if (arr[j] < arr[mini]){
        //                 int temp = arr[j];
        //                 arr[j] = arr[mini];
        //                 arr[mini] = temp;
        //             }
        //         }
        //     }

        //     if (original_copy == arr){
        //         System.out.println("That is true!");
        //     }
        //     else{
        //         System.out.println("False!! ");
        //     }

        // }

        // public static void removeDuplicates(int[] arr, int n){
        //     HashSet<Integer> set = new HashSet<>();
        //     for (int i : arr){
        //         set.add(i);
        //     }

        //     int[] newArr = new int[set.size()];
        //     int index = 0;
        //     for (int i : set){
        //         newArr[index++] = i;
                
        //     }
            
        //     for(int i = 0; i < newArr.length; i++){
        //         System.out.println(newArr[i]);
        //     }
        // }

        // public static void leftRotate(int[] arr, int n, int d){
        //     int[] tempArr = new int[d];
        //     for (int i = 0; i < d ; i++){
        //         tempArr[i] = arr[i];
        //     }
            
        //     // we have initialized the first D elements in a temp array //

        //     // now we re-assign the actual array //
        //     for (int i = 0; i < n - 1 - d  ; i++){
        //         arr[i] = arr[i + d];
        //     }

        //     for (int i = n - d; i < n ; i++){
        //         int temp_index = 0;
        //         arr[i ] = tempArr[temp_index];
        //         temp_index++;
                
        //     }

        //     for (int i = 0; i < n; i++){
        //         System.out.println(arr[i]);
        //     }


            
        // }


        // public static void selectionSort(int[] arr, int n){
        //     for (int i = 0; i < n-1; i++){
        //         int min = i;
        //         for(int j = i+1; j < n; j++){
        //             if (arr[j] < arr[min]){
        //                 min = j;
        //             }
        //         }

        //         int temp = arr[i];
        //         arr[i] = arr[min];
        //         arr[min] = temp;
        //     }

        //     for(int i = 0; i<n; i++){
        //         System.out.println(arr[i]);
        //     }
        // }




}