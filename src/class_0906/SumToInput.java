package class_0906;
import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		int sum = 0;

		Scanner scan = new Scanner(System.in);

		System.out.printf("숫자입력:");
		int cn = scan.nextInt();
		for (int i = 0; i <= cn; i++) {
			sum = sum + i;
		}
		System.out.println("숫자출력:" + sum);
		scan.close();
	}
}
