public class StringDemo {
    public static void main(String[] args) {
        // primitive
        String s1 = "Java Core";
        String s2 = "Java Core";

        // Non primitive
        String s3 = new String("Java Core");
        String s4 = new String("Java Core");

        // so sánh địa chỉ
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

        // equals: so sánh giá trị
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

    }
}
