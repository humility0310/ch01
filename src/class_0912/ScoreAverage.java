package class_0912;

import java.util.Scanner;

public class ScoreAverage {
	public static void main(String[] args){
		int[] studentScore = new int[15];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< studentScore.length; i++){
			System.out.print("입력 ("+(i+1)+")번째 : ");
			studentScore[i] = sc.nextInt();
		}
		for(int i = 0; i< studentScore.length; i++){
			System.out.println("출력 ("+(i+1)+")번째 : "+studentScore[i]);
		}
		sc.close();
	}

}
