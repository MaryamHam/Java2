import java.util.Scanner;

//find two numbers in the array that add up to the target vale. Return their indices.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter number of elements in array : ");
        int n = read.nextInt();
        int[] array = new int[15];

        System.out.println("Enter your target : ");
        int target = read.nextInt();

        System.out.println("Enter elements in array : ");
        for (int x = 0; x < n; x++) {

            array[x] = read.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == target) {
                    System.out.println("Indices of elements " + array[i] + " and " + array[j] + ": [" + i + ", " + j + "]");
                    return;
                }
            }
        }

        System.out.println("there is no elements found.");

        }
    }
