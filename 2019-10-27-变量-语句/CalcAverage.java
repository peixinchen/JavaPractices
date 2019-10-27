public class CalcAverage {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("至少输入一个数");
			return;
		}
		
		// 求和
		int sum = 0;	// 和
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		// 求平均值
		double average = 1.0 * sum / args.length;
		// 输出
		System.out.println("平均值是: " + average);
	}
}