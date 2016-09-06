import java.util.*;
public class LeepYear {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String year = scan.nextLine();
		
		if (Integer.parseInt(year) % 4 == 0) {
			System.out.println("윤년 입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
	}

}
