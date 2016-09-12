package class_0905;
import java.util.*;
public class LeepYear {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.printf("올해를 입력하세요 :");
		String year = scan.nextLine();
		
		if (Integer.parseInt(year) % 4 == 0) {
			System.out.println("윤년 입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
		scan.close();
	}

}
