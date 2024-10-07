class B{
    private int x; //instance member variable
   
void fun1() {
    x = 22;
}

void fun2() {
    System.out.println(x);
} 
    
}

public class PrivateMember {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();
        b1.fun1();  //-->22
        b2.fun2();  //-->0
    }
}
