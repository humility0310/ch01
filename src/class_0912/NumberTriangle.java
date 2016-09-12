package class_0912;

public class NumberTriangle {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("java number triangle [N] : N:숫자");
			return;
		}

		System.out.println("args[0] :" + args[0]);
		int count = Integer.parseInt(args[0]);
		System.out.println("int count = " + count);

		for (int i = 0; i <= count; i++) {
			// System.out.println(i);
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}
