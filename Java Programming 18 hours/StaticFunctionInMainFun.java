public class StaticFunctionInMainFun {
    static void hello1(){
        System.out.println("Hello1");
    }
    static void hello2(){
        System.out.println("Hello2");
    }
    static void hello3(){
        System.out.println("Hello3");
    }
    public static void main(String arg[]){
        hello1();
        hello2();
        hello3();  //or
        StaticFunctionInMainFun.hello3();

    }
}
