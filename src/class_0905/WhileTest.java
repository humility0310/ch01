package class_0905;

public class WhileTest {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			System.out.println("Hello:" + i);
			sum = sum + i;
			i++;
		}
		System.out.println("sum:" + sum);
	}
}
