
public class InstanceVariabless {
    static int x;
    static int z;
    int y;

    public static void main(String[] args) {
        x = 8;
        // Mahesh.y = 9; -->wrong as static and non static
        InstanceVariabless m1 = new InstanceVariabless();
        m1.y = 6;
        System.out.println(x);
        System.out.println(z);//---->> 0
        System.out.println(m1.y);
    }
}
