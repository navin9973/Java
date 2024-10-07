class Mahesh{
    static int x;
    int y;
}
public class InstanceVariables {
    public static void main(String[] args) {
        Mahesh.x = 8;
        // Mahesh.y = 9; -->wrong as static and non static
        Mahesh m1 = new Mahesh();
        m1.y = 6;
        System.out.println(Mahesh.x);
        System.out.println(m1.y);
    }
}
