package class_0906;
import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		int divisor = 2;
		int num = scan.nextInt();
		boolean isPrime = true;

		while (divisor <= num / 2) {
			if (num % divisor == 0) {
				isPrime = false;
			}
			divisor++;
		}

		if (isPrime == true) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
		scan.close();
	}
}
