package exercise;
import java.util.Scanner;
public class Grade {

    public static void main(String[] args) {
        String line = "===========================";
        //创建分割线，便于用户阅读
        Scanner type = new Scanner(System.in);
        System.out.println("请输入学生数量");
        int N = type.nextInt();
        int fall = 0;
        //声明不及格学生数量的变量
        int high = 0;
        //声明最高分学生的变量
        int students[] = new int [N];
        //创建有N个元素的数组
        System.out.println(line);
        System.out.println("请按顺序输入学生的成绩");
        for (int A = 0;A < N;A++) {
            System.out.println("第"+(A+1)+"位学生的成绩为");
            students [A] = type.nextInt(); 
            if (students [A] < 60) {
                //假设及格分数为60
                fall++;
                //不及格人数加一
            }
        }
        type.close();
        for (int check = 1;check < N;check++) {
            //开始判断最高分学生
            if(students[check] < students[high]) {
                //那就不管
            }else {
                high = check;
            }
        }
        int num = high+1;
        //学号一般应该是从1开始，而不是从0开始
        System.out.println(line);
        System.out.println("最高分是"+students[high]+";学号"+(num));
        System.out.println("不及格人数为"+fall);
    }
}
