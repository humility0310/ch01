package class_0905;
import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		int result = 1;
		System.out.print("승수: ");

		int pow = scanner.nextInt();
		int temp = pow;
		
		while(temp>0){
			result = result*2;
			temp--;
		}
		
		
		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");
		scanner.close();
	}

}
