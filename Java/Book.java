package A01061714.BCIT.Assignment1;
/**
 * @author Sasan
 *
 */
public class Book extends Item {

	private Author author;
	private Date datePublished;
	private String title;
	private BookType genre;
	

	/**
	 * @param weightKg
	 * @param manufacturingPriceDollars
	 * @param suggestedRetailPriceDollars
	 * @param uniqueID
	 * @param author
	 * @param datePublished
	 * @param title
	 * @param genre
	 */
	public Book(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars,
			String uniqueID, Author author, Date datePublished, String title,
			BookType genre)
	{
		super(weightKg, manufacturingPriceDollars, suggestedRetailPriceDollars, uniqueID);
		setAuthor(author);
		setDatePublished(datePublished);
		setTitle(title);
		setGenre(genre);
	}


	/**
	 * @return author
	 */
	public Author getAuthor()
	{
		return author;
	}


	/**
	 * @param author
	 */
	public void setAuthor(Author author) 
	{
		
			this.author = author;
		
	}
	


	/**
	 * @return datePublished
	 */
	public Date getDatePublished() 
	{
		return datePublished;
		
	}


	/**
	 * @param datePublished
	 */
	public void setDatePublished(Date datePublished) 
	{
			this.datePublished = datePublished;
		
	}


	/**
	 * @return title
	 */
	public String getTitle() 
	{
		return title;
	}


	/**
	 * @param title
	 */
	public void setTitle(String title) 
	{
		if(title != null)
		{
			this.title = title;
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}


	/**
	 * @return genre
	 */
	public BookType getGenre() 
	{
		return genre;
	}


	/**
	 * @param genre
	 */
	public void setGenre(BookType genre) 
	{
			this.genre = genre;	
	}
	
	/**
	 * @return datePublished
	 */
	
	public int getYearPublished()
	{
		return this.datePublished.getYear();
	}
	
	/**
	 * @return getFullName
	 */
	public String getAuthorFullName()
	{
		return author.getName().getFullName();
	}
	
	/**
	 * @return  genre.getTheBookType()
	 */
	public String getGenreString()
	{
		return genre.getTheBookType();
	}
	
	
}
