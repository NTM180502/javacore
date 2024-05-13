import java.util.Random;

public class Math {
    void ShowPI(){
        System.out.println(3.1415);
    }

    int max(int a, int b){
        return a > b ? a : b;
    }
    int lode(){
        Random random = new Random();
        return random.nextInt(99);
    }

}
