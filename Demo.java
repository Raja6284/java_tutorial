

class A{
    public A(){
        System.out.println("Constructor of class A");
    }

    public A(int x){
        System.out.println("Parameterized constructor of class A");
    }

}

class B extends A{
    public B(){
        System.out.println("Constructor of class B");
    }

    public B(int x){
        //super(x);
        this();
        System.out.println("Parameterized constructor of class B");
    }

}

public class Demo{

    public static void main(String args[]){
        //System.out.println("Hello World");

        // A obj = new A();
        B obj1 = new B(5);
    }
}