import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("몇번 출력할까요?:");
		int count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("Hello,World!(" + (i + 1) + "번)");
		}
		scanner.close();
	}
}
