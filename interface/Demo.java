
// abstract class Computer{
//     public abstract void code();
// }

// class Desktop extends Computer{
//     public void code(){
//         System.out.println("coding by desktop");
//     }
// }

// class Laptop extends Computer{
//     public void code(){
//         System.out.println("Coding by laptop");
//     }
// }

// class Developer{
//     public void dev(Computer cmp){
//         cmp.code();

//     }
// }

// public class Demo{
//     public static void main(String args[]){
        
//         //Laptop lap = new Laptop();

//         Computer desk = new Desktop();
//         Computer lap = new Laptop();

//         Developer raja = new Developer();
//         raja.dev(lap);
//         raja.dev(desk);
//     }
// }


interface A{
    void show();
    void config();
}

interface Y{
    void run();
}

interface Z extends Y{
    //it will have all the method declaration of Y
}

class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }
}


public class Demo{
    public static void main(String args[]){

        A obj ;
        obj = new B();

        obj.config();
        obj.show();
        //obj.run();
    }
}