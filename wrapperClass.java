// Write programs in Java to use Wrapper class of each primitive data types

public class wrapperClass {
    public static void main(String[] args) {
        int num = 8;
        // Integer num1 = new Integer(num); // This is boxing using wrapper class
        Integer num1 = num; // This is auto-boxing using wrapper class
        System.out.println(num1);
    }
}
