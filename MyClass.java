/**
 * Created by amudaliar on 12/15/2016.
 */
class FirstClass{
    void printMessage()
    {
        System.out.printf("Welcome to Java");
    }
}

public class MyClass {
    public static void main(String [] args)
    {
    FirstClass ob1 = new FirstClass();
    ob1.printMessage();
    }
}
