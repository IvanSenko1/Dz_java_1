package Main;
import java.util.Arrays;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(99999);
        int n = Integer.toBinaryString(i).length();

        int c =0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%n == 0) c++;
        
        }

    int[] a1 = new int[c];
    c = 0;
    for (int j = Short.MIN_VALUE; j < i; j++) {
        if (j%n == 0) a1[c++] = j;
    }

    c = 0;
    for (int j = i; j < Short.MAX_VALUE; j++) {
        if (j%n != 0) c++;
    }

    int[] a2 = new int[c];
    c = 0;
    for (int j = i; j < Short.MIN_VALUE; j++) {
        if (j%n != 0) a2[c++] = j;
    }
    
    System.out.println(Arrays.toString(a1));
}}

    
