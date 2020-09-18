package A01061714.BCIT.Assignment1;

/**
 * @author Sasan
 *
 */
public class Address {

	private String streetNumber;
	private String streetName;
	private String city;
	private String postalCode;
	
	
	/**
	 * @param streetNumber
	 * @param streetName
	 * @param city
	 * @param postalCode
	 */
	public Address(String streetNumber, String streetName, String city, String postalCode) {
		super();
		setStreetNumber(streetNumber);
		setStreetName(streetName);
		setCity(city);
		setPostalCode(postalCode);
	}


	/**
	 * @return streetNumber
	 */
	public String getStreetNumber() 
	{
		return streetNumber;
	}


	/**
	 * @param streetNumber
	 */
	public void setStreetNumber(String streetNumber)
	{
		if(streetNumber != null && !streetNumber.isEmpty())
		{
			this.streetNumber = streetNumber;
			
		}	
		
		else
		{
			throw new IllegalArgumentException("invalid entry");
		}
		
	
	}


	/**
	 * @return streetName
	 */
	public String getStreetName()
	{
		return streetName;
	}


	/**
	 * @param streetName
	 */
	public void setStreetName(String streetName) 
	{
		if(streetName != null && !streetName.isEmpty())
		{
			this.streetName = streetName;
			
		}	
		
		else
		{
			throw new IllegalArgumentException("invalid entry");
		}
	}


	/**
	 * @return city
	 */
	public String getCity() 
	
	{
		return city;
	}


	/**
	 * @param city
	 */
	public void setCity(String city) 
	{
		if(city != null && !city.isEmpty())
		{
			this.city = city;
			
		}	
		
		else
		{
			throw new IllegalArgumentException("invalid entry");
		}
	}


	/**
	 * @return postalCode
	 */
	public String getPostalCode() 
	{
		return postalCode;
	}


	/**
	 * @param postalCode
	 */
	public void setPostalCode(String postalCode)
	{
		if(postalCode != null && !postalCode.isEmpty())
		{
			this.postalCode = postalCode;
			
		}	
		
		else
		{
			throw new IllegalArgumentException("invalid entry");
		}
	}
	
}
