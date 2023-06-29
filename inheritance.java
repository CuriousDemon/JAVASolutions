
// Write a program in Java to demonstrate single inheritance, multilevel inheritance and hierarchical inheritance

class Grandparent{
    void methOne(){
        System.out.println("This is grand parent method !!!");
    }
}

// Single level inheritance 

class parent extends Grandparent{
    void methTwo(){
        System.out.println("This is parent method !!!");
    }
}

// Multilevel inheritance & Hierarchical inheritance

class childOne extends parent{
    void meththree(){
        System.out.println("This is child one method !!!");
    }
}

// Multilevel inheritance & Hierarchical inheritance

class childTwo extends parent{
    void methfour(){
        System.out.println("This is child two method !!!");
    }
}

// Multilevel inheritance & Hierarchical inheritance

class childThree extends parent{
    void methfive(){
        System.out.println("This is child three method !!!");
    }
}


