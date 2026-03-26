

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

// class Z{

// }

// class A extends Z implements Runnable{
//     public void run(){
//         for(int i = 0; i<5; i++){
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }


// class B implements Runnable{
//     public void run(){
//         for(int i = 0; i<5; i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
               
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class Demo{
//     public static void main(String args[]){
//         System.out.println("Thread practice");

//         A obj1 = new A();
//         B obj2 = new B();

//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);

//         t1.start();
//         try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) { e.printStackTrace(); }
//         t2.start();

//     }
// }


class Increment{
    public int count = 0;

    public synchronized void increment(){
        count++;
    }
}

class A implements Runnable{
    Increment c;

    public A(Increment c){
        this.c = c;
    }

    public void run(){
        for(int i = 0; i<1000; i++){
            c.increment();
        }
    }
}

class B implements Runnable{
    Increment c;

    public B(Increment c){
        this.c = c;
    }
    public void run(){
        for(int i = 0; i<1000; i++){
            c.increment();
        }
    }
}


public class Demo{
    public static void main(String args[]) throws InterruptedException{

        Increment c = new Increment();

        A obj1 = new A(c);
        B obj2 = new B(c);


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(c.count);
    }
}