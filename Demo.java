
class Calculator{

    
    public int add(int a, int b){

        return a + b;
    }
}

public class Demo{
    public static void main(String args[]){

        int num1 = 3;
        int num2 = 5;

        //int result = num1 + num2;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);

        System.out.println(result);
    }
}