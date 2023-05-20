import java.util.Scanner;;

public class reverseNumber {
    public static void main(String[] args) {
        int num ,rem,reverseNum = 0,tmp; // declare all variables
        Scanner input = new Scanner(System.in); // create an scanner object
        System.out.print("Enter the number : ");
        num = input.nextInt();
        tmp = num;
        // Write the logic of reverse number
        while (num>0) { 
            rem = num%10;
            num = num/10;
            reverseNum = reverseNum * 10  + rem;
        }
        input.close(); // close the object here
        System.out.printf("The reverse number of %d this number is %d", tmp,reverseNum);
    }
}
