
abstract class Computer{
    public abstract void code();
}

class Desktop extends Computer{
    public void code(){
        System.out.println("coding by desktop");
    }
}

class Laptop extends Computer{
    public void code(){
        System.out.println("Coding by laptop");
    }
}

class Developer{
    public void dev(Computer cmp){
        cmp.code();

    }
}

public class Demo{
    public static void main(String args[]){
        
        //Laptop lap = new Laptop();

        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer raja = new Developer();
        raja.dev(lap);
        raja.dev(desk);
    }
}