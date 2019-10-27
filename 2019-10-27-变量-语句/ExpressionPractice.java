public class ExpressionPractice {
	/**
	 * 做了个什么事情
	 * param: args 的意思是什么
	 */
	public static void main(String[] args) {
		/*
		System.out.println(-5 % 3);
		int a = 3;
		int b = 0;
		//System.out.println(a / b);
		double x = 3.0;
		double y = 0.0;
		System.out.println(x / y);
		*/
		
		/*
		System.out.println(1 == 1);
		System.out.println(1 != 1);
		*/
		
		/*
		System.out.println(1 == 1 & 2 == 2);
		System.out.println(1 == 2 & 2 == 2);
		*/
		
		/*
		System.out.println(1 == 2 && 5 / 0 > 10);	// false
		System.out.println(1 == 2 & 5 / 0 > 10);	// false
		*/
		
		/*
		int a = -13;
		System.out.println(a << 1);		// -26
		System.out.println(a >> 1);		// -7
		System.out.println(a >>> 1);	// ?
		*/
		
		int n = 137;
		// 得到 n 的第2-4位
		System.out.println((n >> 2) & 0x7);
		// 把 n 的第2-4位置0，其余不变
		int mask = ~(0x7 << 2);
		System.out.println(n & mask);
	}
}












