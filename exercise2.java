package exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = 1, b = 0, c = 0,sxh;
        for (a = 1;a < 1000;a++) {
            sxh = a*100+b*10+c;
            if (sxh == a*a*a+b*b*b+c*c*c && sxh < 1000) {
                System.out.println(sxh);
            }
            for (b = 0;b < 100;b++) {
                sxh = a*100+b*10+c;
                if (sxh == a*a*a+b*b*b+c*c*c && sxh < 1000) {
                    System.out.println(sxh);
                }
                for (c = 0;c < 10;c++) {
                    sxh = a*100+b*10+c;
                    if (sxh == a*a*a+b*b*b+c*c*c && sxh < 1000) {
                        System.out.println(sxh);
                    }
                }
            }
            reader.close();
        }
    }
}
