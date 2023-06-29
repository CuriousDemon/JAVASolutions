/**
 * passingBy
 */

// Develop minimum 4 program based on variation in methods i.e. passing by value, passing by reference, returning values and objects from methods

class Method{
    int x,y,sum;
    void metOne(int x, int y){
        this.x = x;
        this.y = y;
        sum = this.x+this.y;
        System.out.printf("Addition of %d & %d is %d\n",this.x,this.y,sum);
    }
    void metTwo(Method obj){
        System.out.printf("Addition of %d & %d is %d\n",obj.x,obj.y,obj.sum);
    }
    int metThree(int x, int y){
        this.x = x;
        this.y = y;
        sum = this.x+this.y;
        return sum;
    }
    Method metFour(int a, int b){
        Method obj = new Method();
        obj.x = a;
        obj.y = b;
        obj.sum = a+b;
        return obj;
    }
    
}

