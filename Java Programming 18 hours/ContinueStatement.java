public class ContinueStatement {
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++)
        {
            System.out.println(i);
            if(i==5) continue;
            if(i==5) break; //skipped
            System.out.println("end"); //skipped
        }
    }
}
