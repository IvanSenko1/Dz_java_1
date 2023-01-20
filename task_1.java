package Main;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(999999);
        int n = Integer.toBinaryString(i).length();

        System.out.println(i);
        System.out.println(n);
        
    }

    
}

    
