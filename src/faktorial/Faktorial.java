package faktorial;

import java.util.*;

public class Faktorial {

    public static int FirstFactorial(int num) {
        if (num > 0) {
            int d = 1;
            for (int i = 0; i < num; ++i) {
                d = d * (i + 1);
            }
            num = d;
        } else {
            System.out.print("Please input count > ");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }
}
