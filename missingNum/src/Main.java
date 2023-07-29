import java.util.Scanner;

// find one missing number in the array
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

            int y = n + 1;
            int expectedSum = y * (y + 1) / 2;
            int actualSum = 0;

            for (int num : array) {
                actualSum += num;
            }

            int missingNumber = expectedSum - actualSum;

            System.out.println("Missing Number: " + missingNumber);
        }
    }