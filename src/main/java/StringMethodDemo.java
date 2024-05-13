import java.util.Scanner;

public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java Core";
        String empty = "";
        String blank = "    ";
        String search = "   Samsung   ";
        String name = "Nguyễn Tăng Mạnh";

        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.length() = " + s.length());
        System.out.println("empty.isEmpty() = " + empty.isEmpty());
        System.out.println("blank.isBlank() = " + blank.isBlank());
        System.out.println("s.charAt(0) = " + s.charAt(0));
        System.out.println("s.indexOf(a) = " + s.indexOf('a'));
        System.out.println("s.lastIndexOf(a) = " + s.lastIndexOf('a'));
        System.out.println("s.contains(\"Core\") = " + s.contains("Core"));
        System.out.println("search.trim() = " + search.trim());
        System.out.println("search = " + search);
        String[] words = name.split(" ");
        for (String word : words){
            System.out.println("word = " + word);
        }
        // begin =< ... =< end
        System.out.println("s.substring(0, 4) = " + s.substring(0, 4));

        // bài tập 1
        // input: mạnh --> output: Mạnh
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời người dùng nhập vào tên");
        String s1 = scanner.nextLine();
        String a1=s1.substring(0,1).toUpperCase() + s1.substring(1).toLowerCase();
        System.out.println("a1 = " + a1);

        // bài tập 2
        // yêu cầu người dùng nhập vào họ và tên
        // đếm số từ trong tên
        System.out.println("mời người dùng nhập vào họ và tên");
        String s2 = scanner.nextLine();
        String[] array = s2.split(" ");
        int count = 0;
        for (String word : array) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println("Số từ: " + count);


       int c2 = s2.split("\\s+").length;
        System.out.println("c2 = " + c2);


    }
}
