package class_0912;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] arrayInt1;//추천 방식
		int arrayInt2[]; //비추천 방식
//		int[10] arrayInt3; 오류
		
		arrayInt1 = new int[10];
		
		arrayInt1[0]=1;
		arrayInt1[1]=2;
		arrayInt1[2]=3;
		arrayInt1[3]=4;
		arrayInt1[4]=5;
		
		int[] arrayInt4 = {1, 2, 3, 4, 5};
		
//		Book[] books = {new Book(), new Book()};
	}

}
