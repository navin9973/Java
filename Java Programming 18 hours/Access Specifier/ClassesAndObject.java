class Nokia{
    private int cam;
    private int mic;

    void setValue(){
        mic = 2;
        cam = 40;
    }

    void display(){
        System.out.println(mic);
        System.out.println(cam);
    }
}

public class ClassesAndObject {
    public static void main(String[] args) {
        Nokia n1 = new Nokia();
        n1.display();
        n1.setValue();
        n1.display();
    }

}


