public class daily_prac1 {
    public static void main(String [] args){
        int[] arr = {1,7,3,9,4,6,10};
        int n = arr.length;
        insertionSort(arr, n);

    }

    // public static void bubbleSort(int[] arr, int n){
    //     for (int i = n-1; i >=0; i--){
    //         for (int j = 0; j <= i-1; j++){
    //             if (arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }

    //     for (int i = 0; i<n; i++){
    //         System.out.println(arr[i]);
    //     }
    // }

    public static void insertionSort(int[] arr, int n){
        for (int i =0; i<n; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
