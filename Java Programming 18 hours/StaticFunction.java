class Hello{
    static void hello1(){
        System.out.println("Hello1");
    }
    static void hello2(){
        System.out.println("Hello2");
    }
    static void hello3(){
        System.out.println("Hello3");
    }
}

public class StaticFunction {
    public static void main(String[] args) {
        Hello.hello1();
        Hello.hello2();
        Hello.hello3();
    }
}
