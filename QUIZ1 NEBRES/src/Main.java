public class Main {

    public static void main(String[] args) {
        int[] arr = {100, 392, 121, 222, 312, 254};
        System.out.println("Unsorted Array:");
        printArray(arr);



        bubbleSort(arr);
        System.out.println("Bubble Sort :");
        printArray(arr);

        int[] arr2 = {100, 392, 121, 222, 312, 254};
        System.out.println("Unsorted Array:");
        printArray(arr2);
        selectionSort(arr2);
        System.out.println("\nSelection Sort :");
        printArray(arr2);
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int minIndex = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}