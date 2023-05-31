// 14	3	Write a program in Java to demonstrate the use of 'final' keyword in the field declaration. How it is accessed using the objects?	

public class accessingFinalKeyword {
   final int age = 40;

   // Get the final variable's value
   int getAge(){
    return this.age;
   }
}
