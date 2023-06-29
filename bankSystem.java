class BANK {
    private static int Id = 0;
    private String cusName, cusCity, CusProfession;
    private int cusId;
    private double cusBalance;

    BANK(String name, String city, String profession) {
        cusName = name;
        cusCity = city;
        CusProfession = profession;
        Id++;
        this.cusId = Id;
        cusBalance = 0;
    }

    void getDetails() {
        System.out.println("\t\tWELCOME\n");
        System.out.printf("Customer Id = %d\nName = %s\nCity = %s\nProfession = %s\n\n\n", cusId, cusName, cusCity,
                CusProfession);
    }

    double getBalance() {
        return this.cusBalance;
    }

    void creditBalance(double amount) {

        this.cusBalance += amount;

    }

    double debitBalance(double amount) {

        if (amount <= this.cusBalance) {
            this.cusBalance -= amount;
            return amount;
        } else {
            System.out.println("No Sufficient Fund !!");
            return -1;
        }
    }

}

public class bankSystem {
    public static void main(String[] args) {
        BANK cus1 = new BANK("Rahul", "Delhi", "Student");
        cus1.getDetails();
        cus1.creditBalance(1000);
        System.out.println("Balance = "+cus1.getBalance());
        cus1.debitBalance(300);
        System.out.println("Balance = "+cus1.getBalance());
        cus1.debitBalance(400);
        System.out.println("Balance = "+cus1.getBalance());
        cus1.debitBalance(500);
        System.out.println("Balance = "+cus1.getBalance());
    }
}
