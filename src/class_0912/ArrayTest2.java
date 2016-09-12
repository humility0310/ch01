package class_0912;

public class ArrayTest2 {
	public static void main(String[] args){
//		객체를 저장하는 
		Book[] books = new Book[5];
		
		books[0] = new Book();
		books[0].title ="자바의정석";
		System.out.println(books[0].title);
	}

}
