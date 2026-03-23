class Ind{
    public void show(){
        System.out.println("In Ind");
    }
}

class India extends Ind{
    public void show(){
        System.out.println("In India");
    }
}

public class Over {
    public static void main(String args[]){
        India obj = new India();
        obj.show();
    }
}
