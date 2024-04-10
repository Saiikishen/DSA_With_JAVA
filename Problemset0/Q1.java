import java.util.Scanner;

public class Q1 {
    
        public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid; 
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; 
    }
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        
        int[] arr = new int[size];
        
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        
        System.out.print("Enter the element to search for: ");
        int key = scanner.nextInt();
        
        int linearResult = linearSearch(arr, key);
        if (linearResult != -1) {
            System.out.println("Linear search: Element found at index " + linearResult);
        } else {
            System.out.println("Linear search: Element not found");
        }
        
        bubbleSort(arr);
        
        
        int binaryResult = binarySearch(arr, key);
        if (binaryResult != -1) {
            System.out.println("Binary search: Element found at index " + binaryResult);
        } else {
            System.out.println("Binary search: Element not found");
        }
        
        scanner.close();
    }
}

