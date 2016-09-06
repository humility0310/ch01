import java.util.Scanner;

public class NHelloworld01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("횟수 입력:");
		int count = scan.nextInt();
		int i = 0;
		while (i < count) {
			System.out.println(i+1 + "번째 반복");
			i++;
		}

		System.out.println("count : " + count);

		scan.close();

	}
}
