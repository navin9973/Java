public class ForEachLoop {
    public static void main(String[] args) {
        int nums[] = {3, 4, 6, 9};
        int sum = 0;
        for(int x: nums){
            sum = sum+x;
        }
        System.out.println(sum);
    }
}
