public class LeftRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 2;
        int[] rotatedArray = rotateLeft(a, d);
        System.out.println("Array after " + d + " left rotations:");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }

    // Method to perform left rotation on an array
    public static int[] rotateLeft(int[] arr, int d) {
        int n = arr.length;
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            // Calculate the new index after rotation
            int newIndex = (i + n - d) % n;
            // Assign the element to the new index in the rotated array
            rotatedArr[newIndex] = arr[i];
        }
        return rotatedArr;
    }
}

