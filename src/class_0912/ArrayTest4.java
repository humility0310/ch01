package class_0912;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result = 0;
		for (int i = 0; i < intArray.length; i++) {
			result = result + intArray[i];
		}

		System.out.println("intArray의 4번째 값: " + intArray[3]);

		// 확장for
		for (int value : intArray) {
			System.out.println(value);
			result = result + value;
		}
		System.out.println("result" + result);
	}

}
