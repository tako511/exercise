方法一：
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





方法二
package exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner number = new Scanner (System.in);
        for (int X = 100;X < 1000;X++) {
            //使X范围在三位数中
            int A = X/100,B = X/10%10,C = X%10;
            //让A为X的百位数，B为X的十位数，C为X的个位数
            if (X == A*A*A+B*B*B+C*C*C) {
                System.out.println(X);
            //让A、B、C的立方相加，若等于X，即符合水仙花数的原则，则输出X
            }
        }
    }
}


