package src.com.example.lambdaandstreams;
interface MyInterface{
    void printSomething(String s);
}
public class LambdaExample {
    public static void main(String[] args) {
        MyInterface obj2 = (a)->{
            System.out.println("Example of Lambda");
            System.out.println(a+ " Hellooo");
        };
        obj2.printSomething("Tarun");
    }
}
