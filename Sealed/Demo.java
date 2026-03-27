
sealed class A permits B,C{

}

non-sealed class B extends A{

}

final class C extends A{

}

final class D{

}

public class Demo{
    public static void main(String args[]){
        System.out.println("hello");
    }
}