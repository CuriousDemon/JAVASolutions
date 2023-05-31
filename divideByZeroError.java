// Write a program to develop user defined exception for 'Divide by Zero' error.

public class divideByZeroError {
    public static void main(String[] args) {
        int num1 = 15,num2 = 0;
        try {
            
            System.out.printf("%d/%d = %d",num1,num2,num1/num2);
        } catch (Exception e) {
            // Handle exception
            System.out.println("Divide by zero is not possible ");

        }
    }
}
