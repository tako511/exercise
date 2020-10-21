package exercise;
import java.util.Scanner;
import static java.lang.System.out;
public class Grade {

    public static void main(String[] args) {
        String line = "==============================";
        //创建分割线，便于用户阅读
        Scanner type = new Scanner(System.in);
        out.println("请输入学生数量");
        int N = type.nextInt();
        int fall = 0;
        //声明不及格学生个数的变量
        int high = 0;
        //声明最高分学生变量
        int stu[] = new int [N];
        //创建有N个元素的数组
        out.println(line);
        out.println("请按顺序输入学生的成绩");
        for(int i = 0;i < N;i++) {
            out.println("第"+(i+1)+"个学生的成绩是");
            stu[i] = type.nextInt();
                if(stu[i]<60) {
                    //假定及格分数是60
                    fall++;
                    //不及格学生+1
                    }
         }type.close();
         for(int check = 1;check < N;check++) {
             //开始判断最高分学生
             if(stu[check]<stu[high]) {
             //那就不管
             }else {
                 high = check;
                 }
             }int num = high+1;
             //学号一般应该是从1开始，而不是从0开始
             out.println(line);
             out.println("最高分是"+stu[high]+";学号："+(num));
             out.println("不及格人数为"+fall);
    }

}
