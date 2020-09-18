package A01061714.BCIT.Assignment1;

import java.util.Collection;
import java.util.Iterator;
/**
 * @author Sasan
 *
 */

public class BookStore extends Store{



	private BookType specialty;
	
	
	/**
	 * @param address
	 * @param name
	 * @param specialty
	 */
	
	
	public BookStore(Address address, String name, BookType specialty) 
	{
		super(address,name);

		this.specialty = specialty;
		
		addBooks();
	}
	
	public BookStore(Address address, String name) 
	{
		super(address,name);
	}
	
	
	/**
	 * @param address
	 * @param name
	 * @param specialty
	 */
	public BookStore(Address address, String name, String specialty)
	{
		super(address,name);
		this.specialty = BookType.get(specialty);
		addBooks();
	}
	
	
	private void addBooks(){
	      Date birthDate = new Date(1919, 1, 1);
	      Name name = new Name("Jerome", "David", "Salinger");
	      BookType genre = BookType.get("fiction");
	      Author author = new Author(birthDate, name, genre, "JD");
	      Date datePublished  = new Date(1951, 5, 14);
	      String title = "The Catcher in the Rye";
	      Book b = new Book(0.4, 2.0, 4.0, "1234", author, datePublished, title, genre);
	      addItem(b);
	      
	      datePublished  = new Date(1948, 1, 31);
	      title = "A Perfect Day for Bananafish";
	      genre = BookType.get("fiction");
	      b = new Book(1, 11, 12, "2345", author, datePublished, title, genre);
	      addItem(b); 
	     
	      datePublished  = new Date(1945, 12, 12);
	      title = "A Boy in France";
	      genre = BookType.get("fiction");
	      b = new Book(2, 33, 35, "3456", author, datePublished, title, genre);
	      addItem(b);    
	      
	      birthDate = new Date(1963, 9, 3);
	      name = new Name("Malcolm", "Gladwell");
	      genre = BookType.get("nonfiction");
	      author = new Author(birthDate, name, genre) ;
	      datePublished  = new Date(2008, 11, 18);
	      title = "Outliers";
	      b = new Book(2.1, 2, 6, "4567", author, datePublished, title, genre);
	      addItem(b);
	     
	      
	      datePublished  = new Date(2000, 3, 1);
	      title = "The Tipping Point";
	      genre = BookType.get("nonfiction");
	      b = new Book(0.5, 3, 5, "5678", author, datePublished, title, genre);
	      addItem(b); 
	      
	      birthDate = new Date(1919, 11, 26);
	      name = new Name("Frederik", "Pohl");
	      genre = BookType.get("sciencefiction");
	      author = new Author(birthDate, name, genre, "Paul Dennis Lavond") ;
	      datePublished  = new Date(1977, 7, 4);
	      title = "Gateway";
	      b = new Book(0.01, 4, 4, "6789", author, datePublished, title, genre);
	      addItem(b);      

	      datePublished  = new Date(1937, 10, 6);
	      title = "Elegy to a Dead Planet: Luna";
	      genre = BookType.get("sciencefiction");
	      b = new Book(0.1, 5, 11, "abcd", author, datePublished, title, genre);
	      addItem(b)  ;  
	      
	      birthDate = new Date(1918, 5, 11);
	      name = new Name("Richard", "Phillips", "Feynman");
	      genre = BookType.get("reference");
	      author = new Author(birthDate, name, genre) ;
	      datePublished  = new Date(1942, 5, 20);
	      title = "Principle of Least Action in Quantum Mechanics";
	      b = new Book(0.8, 15, 30, "efgh", author, datePublished, title, genre);
	      addItem(b);       

	      
	 

	      datePublished  = new Date(1964, 6, 30);
	      title = "The Messenger Lectures";
	      genre = BookType.get("reference");
	      b = new Book(0.6, 44, 45.5, "ijkl", author, datePublished, title, genre);
	      addItem(b);             

	      datePublished  = new Date(1985, 11, 1);
	      title = "Surely You're Joking Mr. Feynman";
	      genre = BookType.get("nonfiction");
	      b = new Book(1.0, 3, 13, "mnop", author, datePublished, title, genre);
	      addItem(b);             
	  }
	  

	/**
	 * displayAllBooksByEveryAuthor()
	 */
	@SuppressWarnings("unchecked")
	public void displayAllBooksByEveryAuthor()
	{
		Collection<Book> books = getCollectionOfItems();
		
		for(Book b: books)
		{
			System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " in " + b.getDatePublished().getYear() + ".");
		}
	}
	
	/** 
	 * @return specialty
	 */
	public BookType getSpecialty() 
	{
		return specialty;
	}

	/**
	 * @param specialty
	 */
	public void setSpecialty(BookType specialty) {
		this.specialty = specialty;
		
	}

	/**
	 * displayAllBooksByAuthor()
	 * @param lastName
	 */
	@SuppressWarnings("unchecked")
	public void displayAllBooksByAuthor(String lastName)
	{
		Collection<Book> books = getCollectionOfItems();
		
		if(lastName != null && !lastName.isEmpty())
		{
			
			for(Book b: books)
			{
				System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle());
			}
		}
			else
			{
			
				System.out.println("last name cannot be null");
			
			
			}
	}
	
	/**
	 * displayAllBooksWrittenBefore()
	 * @param year
	 */
	@SuppressWarnings("unchecked")
	public void displayAllBooksWrittenBefore(int year)
	{
		Collection<Book> books = getCollectionOfItems();
		
		if(year >= 0)
		{
			
			for(Book b: books)
			{
				System.out.println(b.getTitle() + "was published in" + b.getDatePublished().getYear() + ", which is before" + year);
			}
		}
		else
		{
			System.out.println("year cannot be less than zero");
		}
	}
	
	/**
	 * displayTitlesOfBooksWrittenBy()
	 * @param pseudonym
	 */
	@SuppressWarnings("unchecked")
	public void displayTitlesOfBooksWrittenBy(String pseudonym)
	{
		Collection<Book> books = getCollectionOfItems();
		
		
		if(pseudonym != null && !pseudonym.isEmpty())
		{
			for(Book b: books)
			{
				if(b.getAuthor().getPseudonym().equals(pseudonym))
				{
					System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " as " + b.getAuthor().getPseudonym());
				}
			}
		}
			else
			{
				System.out.println("pseudonym cannot be null");
			}
	}
	
	/**
	 * displayAllBooksForGenre()
	 * @param genre
	 */
	@SuppressWarnings("unchecked")
	public void displayAllBooksForGenre(String genre)
	{
		Collection <Book> books = getCollectionOfItems();
		
		if(genre != null && !genre.isEmpty())
		{
			for(Book b: books)
			{
				if(b.getGenreString().equals(genre))
				{
				System.out.println(b.getTitle() + " is a "+ b.getGenre().toString().toLowerCase()+ " book written by " + b.getAuthor().getName().getLastName());
			
				}
			}
		}
		
		else
		{
			System.out.println("genre cannot be null");
		}
		

	}
	
	/**
	 * displayTotalWeightKgOfAllBooks ()
	 */
	@SuppressWarnings("unchecked")
	public void displayTotalWeightKgOfAllBooks()
	{
		Collection<Book> books = getCollectionOfItems();
		double weightSum = 0.0;
		
		for(Book b: books)
		{
			weightSum += b.getWeightKg();
		}
		
		System.out.println("total kg of books:" + weightSum);
	}
	
	

	/**
	 * displayAllBooksWrittenByAuthorsOverThisAge()
	 * @param ageInYears
	 */
	@SuppressWarnings("unchecked")
	public void displayAllBooksWrittenByAuthorsOverThisAge(int ageInYears){
	      Collection<Book> books 	= getCollectionOfItems(); // From the Store class
	      Iterator<Book> it 		= books.iterator();
	      boolean displayedSome 	= false;
	      while(it.hasNext()){
	        Book b = it.next();
	        int ageYears = b.getDatePublished().getYear() - b.getAuthor().getBirthDate().getYear();
	        if(ageYears > ageInYears)
	        {
	            System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + " at age " + ageYears + 
		", which is more than " + ageInYears);
	            displayedSome = true;
	        }
	      }      
	      if(displayedSome == false){
	          System.out.println("No books by authors over age " + ageInYears);  
	      }
	  }
	 
	/**
	 * displayAllBooksWrittenByAuthorsBornOn()
	 * @param dayOfTheWeek
	 */
	@SuppressWarnings("unchecked")
	public void displayAllBooksWrittenByAuthorsBornOn(String dayOfTheWeek)
	{
		
		Collection <Book> books = getCollectionOfItems();
		boolean notFound = true;
		if(dayOfTheWeek != null && !dayOfTheWeek.isEmpty())
		{
			for(Book b: books)
			{
				String day = b.getAuthor().getBirthDate().getDayOfTheWeek();
				if(day.equals(dayOfTheWeek))
				{
					System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + " ,who was born on a " + day);
				}

			}
			
		}
		else
		{
			System.out.println("Wrong day");
		}
		
		if(notFound)
		{
			System.out.println("No Author were born on a " + dayOfTheWeek);
		}
	}


	
	/**
	 * displayAllBooksPublishedOn()
	 * @param dayOfTheWeek
	 */
	@SuppressWarnings("unchecked")
	public void displayAllBooksPublishedOn(String dayOfTheWeek)
	{
		boolean notFound = true;
		Collection<Book> books = getCollectionOfItems();
		
		for(Book b: books)
		{
			if(b.getDatePublished().getDayOfTheWeek().equals(dayOfTheWeek))
			{
				System.out.println(b.getTitle()+ " Was written by" + b.getAuthor().getName().getLastName() + " was published on "+ b.getDatePublished().getDayOfTheWeek());
				notFound = false;
			}
		}
		if(notFound)
		{
			System.out.println("No books were published on a " + dayOfTheWeek);
		}
	}
	
	

	/**
	 * displayAllBooksWrittenByAuthorsWithAPseudonym()
	 */
	@SuppressWarnings("unchecked")
	public void displayAllBooksWrittenByAuthorsWithAPseudonym()
	{
		Collection <Book> books = getCollectionOfItems();
		
		for(Book b: books)
		{
			String psnym = b.getAuthor().getPseudonym();
			if(psnym != null && !psnym.isEmpty())
			{
				System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " as " + b.getAuthor().getPseudonym());
			}
		}
	}
	
	/**
	 * displayBookWithBiggestPercentageMarkup()
	 */
	@SuppressWarnings("unchecked")
	public void displayBookWithBiggestPercentageMarkup()
	{
		Collection<Book> books = getCollectionOfItems();
		double markUp 		 = 0.0;
		double highestMarkUp   = 0.0;
		Book bookMarkUp		 = null;
		
		for(Book b: books)
		{
			markUp = (100 * (b.getSuggestedRetailPriceDollars() - b.getManufacturingPriceDollars()));
			if(markUp > highestMarkUp)
			{
				highestMarkUp = markUp;
				bookMarkUp = b;
			}
		}
		System.out.println("Highest markup is " + highestMarkUp + "%, for " + bookMarkUp.getTitle() + " by " + bookMarkUp.getAuthor().getName().getLastName());
	}

	
	
	/**
	 * displayAllBooksWrittenOutsideSpecialty()
	 */
	@SuppressWarnings("unchecked")
	public void displayAllBooksWrittenOutsideSpecialty()
	{
		Collection <Book> books = getCollectionOfItems();
		
		Iterator <Book> it = books.iterator();
		
		while(it.hasNext())
		{
			Book b = it.next();
			if(b.getAuthor().getGenre().equals(b.getGenre()))
			{
				continue;
			}
			
			else
			{
				System.out.println(b.getAuthor().getName().getLastName() + "usually wrote " + b.getAuthor().getGenre().toString().toLowerCase()
						+ " but wrote " + b.getTitle()+ " which is " + b.getGenre().toString().toLowerCase());
			}
		}
	}
}



