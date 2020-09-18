package A01061714.BCIT.Assignment1;
/**
 * @author Sasan
 *
 */
public class Name {

	private String firstName;
	private String middleName;
	private String lastName;

	
	/**
	 * @param name
	 * @param middleName
	 * @param lastName
	 */
	public Name(String firstName, String middleName, String lastName) 
	{
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);

	}
	
	/**
	 * @param name
	 * @param lastName
	 */
	public Name(String firstName, String lastName)
	{
		
		setFirstName(firstName);
		setLastName(lastName);

	}
	
	/**
	 * @param firstName
	 */
	public Name(String firstName)
	{
		setFirstName(firstName);
	}
	
	

	/**
	 * @return name
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param name
	 */
	public void setFirstName(String firstName) 
	{
		if(firstName != null && !firstName.isEmpty()) 
		{
			this.firstName = firstName;
		}
		
		else
		{
			throw new IllegalArgumentException("invalid entry");
		}
	}
	
	
	
	/**
	 * @return middleName
	 */
	public String getMiddleName() 
	{
		return middleName;
		
	}

	/**
	 * @param middleName
	 */
	public void setMiddleName(String middleName) 
	{
		if(middleName != null && !middleName.isEmpty()) 
		{
			this.middleName = middleName;
		}
		
		else
		{
			throw new IllegalArgumentException("invalid entry");
		}
		
	}

	/**
	 * @return lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName)
	{
		if(lastName != null && !lastName.isEmpty()) 
		{
			this.lastName = lastName;
		}
		
		else
		{
			throw new IllegalArgumentException("invalid entry");
		}
	}

	/**
	 * @return fullName
	 */
	public String getFullName() 
	{
		String completeName = "";
		
		//firstname and last name
		if(firstName != null && lastName != null)		
			completeName = String.format("%s %s", firstName, lastName);
		//first, middle ,and last name			
		if(firstName != null && middleName !=null && lastName != null)
			completeName = String.format("%s %s %s ", firstName, middleName, lastName);
		//last name
		if(middleName == null && firstName == null)
			completeName = String.format("%s", lastName);
		//firstname only
		if(middleName == null && lastName == null)
			completeName = String.format("%s", firstName);
		
		return completeName;
	}
	
}
