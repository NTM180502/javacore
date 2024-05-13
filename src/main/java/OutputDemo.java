import com.sun.source.doctree.EscapeTree;

import java.io.PrintStream;
import java.util.Locale;

public class OutputDemo {
    public static void main(String[] args) {
        //Escape character
        // \"-->"
        // \'-->'
        // \\-->\
        // \n-->xuống dòng
        // \t--> táp


        // System.out.print
        System.out.print("\"Java\" Core\n ");
        System.out.print("\"Java\" Core\n ");

        // System.out.printnl
        System.out.println("\"Java\" Core");

        // System.out.printf
        //%d: số nguyên (byte, short, int, long)
        //%f: số thực (float, double)
        //%s: String
        //%c: ký tự char
        //%n: Xuống dòng
        String name = "khoa";
        int age = 15;
        System.out.println("tên:" + name + ",tuổi: " + age);
        System.out.printf("tên:%s, tuổi:%d%n", name,age);
        // căn lề
        System.out.printf("| %8s |%n", "123");
        System.out.printf("| %-8s |%n", "123");
        System.out.printf("| %8s |%n", "123456789");
        // làm tròn số
        System.out.printf("PI = %.2f%n",3.1415);
        System.out.printf("PI = %.3f%n",3.1415);
        //Nhóm 3 số
        System.out.printf("Money = %,f%n", 123456000.78);
        System.out.printf(Locale.JAPAN,"Money = %,d%n", 123456000);
        System.out.printf( new Locale("vi"),"Money = %,d%n", 123456000);
        // In hoa %S, %C
        System.out.printf("Tên: %S%n", "long");
    }
}
