public class exercise {
	public static void main(String[] args) {
		for (int a = 9;a > 0 && a < 10;a--) {
			for (int b = 1;b <= a;b++) {
		    	System.out.print(a+"*"+b+"="+a*b+'\t');
			}
			System.out.println();
		}
	}
}
