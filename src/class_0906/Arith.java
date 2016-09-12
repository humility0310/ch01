package class_0906;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		a = a + 1;
		System.out.println(a);

		a += 1;
		System.out.println(a);

		a++;
		System.out.println(a);

		++a;
		System.out.println(a);

		System.out.println("a++ =" + a++);

		System.out.println("++a =" + ++a);

		// 나누기연산
		System.out.println("10/3 = " + 10 / 3);
		System.out.println("10/3 = " + 10. / 3);
		System.out.println("10/3 = " + 10 / 3.);

		System.out.println(-7 % 3);
		System.out.println(7 % -3);
	}

}
