package myAssignment;

public class mainApp {
	
	public static void main(String[] args){
		

		Book myBook = new Book();
		Software mySW = new Software();
	
		System.out.println(myBook.whoAmI());
		System.out.println(mySW.whoAmI());
		
		Book newBook = new Book();
		
		if (myBook.equals(newBook))
			System.out.println("the books are the same");
		
		
	}

}
