public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] names = new String[]{"khoa", "khóa", "khang"};
        int[] array = new int[5];

        // kích thước của mảng
        System.out.println("numbers.length = " + numbers.length);
        System.out.println("names.length = " + names.length);
        System.out.println("array.length = " + array.length);

        //truy cập dựa theo chỉ số (index) chỉ số của mảng bắt đầu từ 0
        System.out.println("names[1] = " + names[1]);

        //lấy ra phần tử cuối cùng của một mảng
        int lastIndex = numbers.length - 1;
        System.out.println("names[lastIndex] = " + numbers[lastIndex]);

//        //lặp các phần tử trong mảng
//        for (int i = 0; i <= numbers.length; i++) {
//            System.out.println("numbers[i] = " + numbers[i]);
//        }
//        //lặp các phần tử trong mảng(từ phải qua trái)
//        for (int i = numbers.length; i >= 0; i--) {
//            System.out.println("numbers[i] = " + numbers[i]);
//        }




    }
}
