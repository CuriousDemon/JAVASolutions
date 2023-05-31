// Write a program in Java to demonstrate use of this keyword. Check whether this can access the private members of the class or not.

public class accessingPrivetVariable {
    // Declare privet variables
    private int age;
    private String name;

    // Method for set privet age variable
    void setAge(int age)
    {
        this.age = age;
    }

    // Method for set privet name variable
    void setName(String name)
    {
        this.name = name;
    }

    // Access privet age varible
    int getAge()
    {
        return this.age;
    }

    // Access privet name varible
    String getName()
    {
        return this.name;
    }
}
