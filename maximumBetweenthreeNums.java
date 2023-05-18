/*Write a program in Java to find maximum of three numbers using
conditional operator*/

public class maximumBetweenthreeNums {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 13;
        int num3 = 80;


        // Using if-elseIf-else and conditional operator to find maximum number
        if (num1 > num2 && num1 > num3) {
            System.out.println("The maximum number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The maximum number is " + num2);
        }else{
            System.out.println("The maximum number is " + num3);
        }
    }
}
