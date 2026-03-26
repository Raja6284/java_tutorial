

// class A extends Thread{
//     public void run(){
//         for(int i = 0 ; i<5; i++){
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) { e.printStackTrace(); }
//         }
//     }
// }

// class B extends Thread{
//     public void run(){
//         for(int i = 0 ; i<5; i++){
//             System.out.println("hello");
//              try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) { e.printStackTrace(); }
//         }
//     }
// }

class Z{

}

class A extends Z implements Runnable{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class B implements Runnable{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
    }
}

public class Demo{
    public static void main(String args[]){
        System.out.println("Thread practice");

        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
                Thread.sleep(5);
            } catch (InterruptedException e) { e.printStackTrace(); }
        t2.start();

    }
}


