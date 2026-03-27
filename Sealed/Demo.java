
sealed class A permits B,C{

}

non-sealed class B extends A{

}

final class C extends A{

}

final class D{

}

sealed interface X permits Y{

}

non-sealed interface Y extends X{
    //interface can only be sealed and non-sealed, interface cannot be final
}

public class Demo{
    public static void main(String args[]){
        System.out.println("hello");
    }
}