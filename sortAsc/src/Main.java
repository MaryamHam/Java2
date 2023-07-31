import java.util.Scanner;

//giving an array of integer number , sort the array in ascending order
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

        System.out.println(" element original order ");
        for(int i = 0; i < number.length; i++ ){
            System.out.print( number[i]+ "\t");
        }


        int n = 0;
        for (int i = 0; i < number.length; i++ ){
            for (int j = i+1 ; j < number.length; j++ ){
                if(number[i]> number[j]){
                    n = number[i];
                    number [i]=number[j];
                    number[j] = n;
                }
            }
        }
        System.out.println();

        System.out.println(" element ascending order ");
        for(int i = 0; i < number.length; i++ ){
            System.out.print( number[i]+ "\t");
        }
        }


    }
