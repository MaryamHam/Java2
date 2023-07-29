import java.util.Scanner;

// given sorted array, we will remove duplicated in place
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter number of elements in array : ");
        int n = read.nextInt();
        int[] array = new int[15];

        System.out.println("Enter elements in array : ");
        for (int x = 0; x < n; ++x) {
            array[x] = read.nextInt();
        }

        if (array.length == 0) {
            System.out.println("New Length: 0");
            return;
        }

        int uniqueIndex = 0;

        for (int x = 1; x < array.length; x++) {
            if (array[x] != array[uniqueIndex]) {
                uniqueIndex++;
                array[uniqueIndex] = array[x];
            }
        }

        int newLength = uniqueIndex ;

        System.out.println("New Length: " + newLength);
        System.out.print("New Array: ");
        for (int y = 0; y < newLength; y++) {
            System.out.print(array[y] + " ");
        }

    }
}