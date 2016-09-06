import java.util.*;
public class SwtichTest {

	public static void main(String[] args) {
		
		
		System.out.printf("몇월인지 입력하세요:");
		
		Scanner scan = new Scanner(System.in);
		String month = scan.nextLine();
		int days = 0;

		if (Integer.parseInt(month) == 2) {
			days = 28;
		} else if (Integer.parseInt(month) < 8) {
			if (Integer.parseInt(month) % 2 == 1) {
				days = 31;
			} else {
				days = 30;
			}
		} else {
			if (Integer.parseInt(month) % 2 == 1) {
				days = 30;
			} else {
				days = 31;
			}
		}
		System.out.println(month + "월은 " + days + "일까지 있습니다.");
		scan.close();
	}
}
