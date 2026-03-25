
enum Laptop{
    Loq(1222),dell(1344),mac,hp(11111);

    private int price;

    private Laptop(){
        price = 200;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

}

public class Demo {
    public static void main(String args[]){

        Laptop ll[] = Laptop.values();

        for(Laptop l:ll){
            System.out.println(l.ordinal() + " " + l + " " + l.getPrice());
        }
    }
}


// class A{
//     public void show(){
//         System.out.println("in A show");
//     }
// }

// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }


// public class Demo {

//     public static void main(String args[]){
//         A obj = new A();
//         A obj1 = new B();
//         B obj2 = new B();
       
//         obj.show();
//         obj1.show();
//         obj2.show();
//     }
// }