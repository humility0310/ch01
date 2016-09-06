
public class InfiniteLoop {

	public static void main(String[] args) {
		/*
		 * for (;;) { }
		 */
		int k = 0;
		int sum = 0;
		while (k <= 1000) {
			sum = sum + k;
			k++;
		}
		System.out.println("sum: " + sum);
	}
}
