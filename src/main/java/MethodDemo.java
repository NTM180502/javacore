public class MethodDemo {
    public static void main(String[] args) {
        Math math = new Math();

        math.ShowPI();

        int max = math.max(1, 1000);
        System.out.println("max = " + max);


        System.out.println("de1 = " + math.lode());
        System.out.println("de2 = " + math.lode());
        System.out.println("de3 = " + math.lode());
    }
}
