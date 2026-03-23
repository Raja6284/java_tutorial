

// class A{
//     public A(){
//         System.out.println("Constructor of class A");
//     }

//     public A(int x){
//         System.out.println("Parameterized constructor of class A");
//     }

// }

// class B extends A{
//     public B(){
//         System.out.println("Constructor of class B");
//     }

//     public B(int x){
//         //super(x);
//         this();
//         System.out.println("Parameterized constructor of class B");
//     }

// }






public class Demo{
    public static void main(String args[]){
        System.out.println("Hello World");

        //Calc obj = new Calc();
        AdvCalc obj  = new AdvCalc();

        int r1 = obj.add(3,4);
        int r2 = obj.sub(5,2);
        int r3 = obj.multi(3,4);
        int r4 = obj.div(10,2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}