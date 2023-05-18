// Write a program in Java to generate first n prime numbers.

public class prime {
    public static void main(String[] args) {
        int flag = 0;
        int num1 = 1;
        int num2 = 20;

        // Printing all prime numbers between num1 to num2

        for (int i = num1; i <= num2; i++)
        {
            flag = 0; // this variable is use to decide a number is prime or not
            if (i == 1 || i == 2) {
                System.out.println(i+" is a prime number");
                continue; // Use to cancel current iteration
            }
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    flag = 1;
                    break; // use to break the inner loop
                }
            }          
            if (flag == 0) {
                System.out.println(i+" is a prime number");
            }
        }

    }
}
