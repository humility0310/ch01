package class_0905;

public class ContiuneTest {

	public static void main(String[] args) {/*
							 * for (int i = 0; i <= 20; i++) { if (i % 2 != 0 &&
							 * i % 3 != 0) { System.out.println(i); } }
							 */
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				continue;
			}
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
