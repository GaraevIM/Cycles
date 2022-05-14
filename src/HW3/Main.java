package HW3;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {


        int l = 0;
        while (l < 10) {
            l = l + 1;
            System.out.printf("%d\t", l);
        }
        System.out.println();

        for (int n = 10; n > 0; n--) {
            System.out.printf("%d\t", n);
        }

        System.out.println();



        for (int f = 3; f <= 31; f += 7) {
            System.out.println("Сегодня пятница, " + f + "-е число. Необходимо подготовить отчет");
        }


        int a = 2022;
        int b = a - 200;
        int c = a + 100;
        int d = 0;
        while (d < c) {
            d = d + 79;
            if (d <= b)
                continue;
            if (d > c)
                break;
            System.out.println(d);
        }



    }
}
