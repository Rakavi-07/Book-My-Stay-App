
public class UseCase16BubbleSort {

    public static void main(String[] args) {

        System.out.println("Passenger Bogie Capacity Sorting (Bubble Sort)\n");

        // sample capacities
        int[] capacities = {50, 20, 70, 10, 40};

        System.out.println("Before Sorting:");
        printArray(capacities);

        // Bubble Sort
        bubbleSort(capacities);

        System.out.println("\nAfter Sorting:");
        printArray(capacities);
    }

    // Bubble Sort logic
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // helper method to print array
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}