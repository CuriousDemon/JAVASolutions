/* Write a program in Java to find second maximum of n numbers
without using arrays*/
public class secondMax {
    // This code use comment line argument to take input from user 
    public static void main(String[] args) {
        int firstMax,secondMax,num,i = 0; // declear all necessery variable
        secondMax = -9999; // assign second max number with a small number
        firstMax = -9999; // assign second max number with a small number
        while (i < args.length) {
            num =Integer.parseInt( args[i]);
            if (args.length < 2) {
                firstMax = num;
                secondMax = num;
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
        }
        // System.out.print("Second max element is : "+ secondMax);
        System.out.printf("Total %d numbers you have enters\n", args.length);
        System.out.printf("Second max element is : %d", secondMax);
    }
}
