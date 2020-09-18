package A01061714.BCIT.Assignment1;
/**
 * @author Sasan
 *
 */
public class Main {

	public static void main(String[] args) {
	
		
		System.out.println("Book Store: ");
		System.out.println("_____________________________________________________________________");

		Address testAdd = new Address("1234", "Main Street", "Vancouver", "A3A A4A");
		
		BookStore b1 = new BookStore(testAdd, "Chapters", "fiction");
		
		b1.displayAllBooksByEveryAuthor();
		
		System.out.println();
		System.out.println("Shoe Store: ");
		System.out.println("_____________________________________________________________________");

		Address testAdd2 = new Address("789", "East 1st Street", "Vancouver" , "V3A 7A4");
		ShoeStore s1	 = new ShoeStore(testAdd2, "My Shoes", "children");
		s1.displayAllShoesAndDesigners();
	}

}
