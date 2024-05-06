public class dataType {
    public static void main(String[] args) {
//        System.out.println("hello");
//        kiểu số nguyên; byte, short, int, long

//        cú pháp tọa biến

//        [kiểu dữ liệu] [tên biến] = [giá_trị_khởi_tạo];
//        int age = 18;
//        System.out.println("age = " + age);

//        kiểu số thực; float, double
//        float pi = 3.14f;
//        System.out.println("pi = " + pi);


//        kiểu logic; boolean T/F

//        kiểu kí tự; char
//        char c = 'a';
//        System.out.println("c = "+ c);

//        kiểu show kí tự; String
//        String name = "mạnh";
//        System.out.println("name = " + name);


//        Gender male = Gender.MALE;
//        System.out.println("male = " + male);
//        class & object
        Dog dog1 = new Dog();
        dog1.name = "mun";
        dog1.age = 3;
        dog1.gender = Gender.FEMALE;
        dog1.bark();
        int sum = dog1.sum(1 , 10);
        System.out.println("sum = " + sum);

        Dog dog2 = new Dog();
        dog2.name = "pitbull";
        dog2.age = 1;
        dog2.gender = Gender.MALE;
        dog2.bark();
    }
}
