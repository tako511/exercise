package exercise;

public class Exercise {
    public static void main(String[] args) {
        for (int A = 9;A > 0 && A < 10;A--) {
		//使A等于9，并以1为单位逐渐减小直到A等于1
            for (int B = 1;B <= A;B++) {
		//使B等于1，并以1为单位逐渐增加直到B等于A
            System.out.print(A+"*"+B+"="+A*B+'\t');
		//循环输出A*B=？的公式，利用'\t'使每两个输出值之间的距离相等
            }
            System.out.println();
		//将A不同的输出值分隔开
        }
    }
}
