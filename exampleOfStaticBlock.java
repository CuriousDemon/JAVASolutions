/*
 * Write a static block which will be executed before main( ) method in a
class.
 */
public class exampleOfStaticBlock {

    static {
        System.out.println("First execute");
    }

    public static void main(String[] args) {
        System.out.println("Second execute ");
    }
}