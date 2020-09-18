package A01061714.BCIT.Assignment1;
/**
 * @author Sasan
 *
 */
public class Author {
	
	
	private Date birthDate;
	private Name name;
	private BookType genre;
	private String pseudonym;
	
	/**
	 * @param birthDate
	 * @param name
	 * @param genre
	 * @param pseudonym
	 */
	public Author(Date birthDate, Name name, BookType genre, String pseudonym)
	{
		setBirthDate(birthDate);
		setName(name);
		setGenre(genre);
		setPseudonym(pseudonym);
		
	}
	
	/**
	 * @param birthDate
	 * @param name
	 * @param genre
	 */
	public Author(Date birthDate, Name name, BookType genre)
	{
		
		setBirthDate(birthDate);
		setName(name);
		setGenre(genre);
		
		
	}


	/**
	 * @return birthDate
	 */
	public Date getBirthDate() 
	{
		return birthDate;
	}

	/**
	 * @param birthDate
	 */
	public void setBirthDate(Date birthDate) 
	{
		
		this.birthDate = birthDate;

	}

	/**
	 * @return name
	 */
	public Name getName() 
	{
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(Name name) 
	{
	
			this.name = name;
		
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
	 * @return pseudonym
	 */
	public String getPseudonym()
	{
		return pseudonym;
	}

	/**
	 * @param pseudonym
	 */
	public void setPseudonym(String pseudonym) 
	{
		if(pseudonym != null)
		{
		
			this.pseudonym = pseudonym;
		}
		
		else
		{
			throw new IllegalArgumentException();
		}
	}

}
