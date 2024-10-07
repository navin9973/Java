class Example {
    void hello1() {
        System.out.println("Hello1");
    }

    void hello2() {
        System.out.println("Hello2");
    }

    void hello3() {
        System.out.println("Hello3");
    }

}

public class NonStaticFunction {

    public static void main(String arg[]) {
        Example  obj1 = new Example();
        obj1.hello1();
        obj1.hello2();
        obj1.hello3();

    }
}
