import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter number of elements in array : ");
        int num = read.nextInt();
        int[] number = new int[num];

        System.out.println("Enter elements in array : ");
        for (int x = 0; x < num; x++) {
            number[x] = read.nextInt();
        }

        int result = findNumber(number);
        System.out.println("The smallest missing positive integer is: " + result);


        int z = 0;
        System.out.println(" element ascending order ");
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    z = number[i];
                    number[i] = number[j];
                    number[j] = z;
                }
            }
            System.out.print(number[i] + "\t");
        }

    }

    public static int findNumber(int[] number) {
        int n = number.length;

        // Separate positive and negative numbers
        int notPositive = leftNum(number);

        visited(number, notPositive);

        for (int i = notPositive; i < n; i++) {
            if (number[i] > 0) {
                int positive = i - notPositive + 1;
                return positive;
            }
        }

        return n - notPositive + 1;
    }

    static int leftNum(int[] number) {
        int n = number.length;
        int notPositive = 0;
        int num = 0;

        for (int i = 0; i < n; i++) {
            if (number[i] <= 0) {
                num = number[i];
                number[i] = number[notPositive];
                number[notPositive] = num;
                notPositive++;
            }
        }

        return notPositive;
    }

    static void visited(int[] number, int notPositive) {
        int n = number.length;

        for (int i = notPositive; i < n; i++) {
            int value = number[i];
            if (value > 0 && value <= n-notPositive) {
                number[notPositive+ number[i]- 1] = -number[notPositive+ value - 1];
            }
        }
    }


}