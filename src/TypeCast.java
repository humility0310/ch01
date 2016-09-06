
public class TypeCast {

	public static void main(String[] args) {
//		implicity(암시적) typecasting
		int i = 10;
		long l = i;
		System.out.println(i + ":" + l);
		
		//explicity(명시적) type casting
		long l2 = 123456789;
		int i2 = (int)12;
		
		System.out.println(i2 + ":" + l2);
	}

}
