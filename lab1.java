import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        double []b = new double[10];
        double m = 1;
        for (int h = 0; h <10; h++) {
            b[h] = 1/m;
            m++;
        }

        int i = 0;
        while (i < 10 ){
            System.out.println(b[i]);
            i ++;
        }
    }
}
