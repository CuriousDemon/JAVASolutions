
// 19	4	Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values.	

class base{
    int x,y;
    base(int a, int b){
        x = a;
        y = b;
        System.out.printf("This is base class here x = %d & b = %d\n",x,y);
    }
}

class derive extends base{
    int m,n;
    derive(int a, int b){
        super(a, b);
        m = a;
        n = b; 
        System.out.printf("This is derive class here m = %d & n = %d\n",m,n);
    }
}


