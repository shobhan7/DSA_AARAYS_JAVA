import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
         movingzero(arr,n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    private static void movingzero(int[] arr, int n) {
        int nonzero = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonzero] = arr[i];
                nonzero++;
            }
        }
        while (nonzero< n) {
            arr[nonzero] = 0;
            nonzero++;

        }
    }

}



