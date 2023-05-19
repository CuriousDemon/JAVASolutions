/* Write a program in Java to find second maximum of n numbers
without using arrays*/
import java.util.Scanner;

// This program only work for positive number

public class findSecondMax {
    public static void main(String[] args) {
        int firstMax,secondMax,num,i = 1; // declear all necessery variable
        boolean x = true;
        System.out.println("Type -1 to exit from programme");
        System.out.print("Enter positive number : ");
        Scanner input = new Scanner(System.in); // create a "input object here"
        num = input.nextInt();
        firstMax = num;
        secondMax = -9999; // assign second max number with a small number
        while (x) {
            System.out.print("Enter positive number : ");
            num = input.nextInt();
            // Write a condition to break the loop or exit from the program
            if (num == -1 && i == 2) {
                break;
            }else if (num == -1) {
                secondMax = firstMax;
                break;
            }

            // Write code to find second max number 
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            }else if (num > secondMax) {
                secondMax = num;
            }

            i++;
            // Write logic for all positive value equal to "true"
            if (i>0) {
                x = true;
            }
        }
        // System.out.print("Second max element is : "+ secondMax);
        System.out.printf("Second max element is : %d", secondMax);
        input.close();
    }
}
