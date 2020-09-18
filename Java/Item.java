package A01061714.BCIT.Assignment1;
/**
 * @author Sasan
 *
 */
public class Item {
	
	private double weightKg;
	private double manufacturingPriceDollars;
	private double suggestedRetailPriceDollars;
	private String uniqueID;
	
	public final static int BASE_NUMBER = 0;
	
	
	/**
	 * @param weightKg
	 * @param manufacturingPriceDollars
	 * @param suggestedRetailPriceDollars
	 * @param uniqueID
	 */
	public Item(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars,
			String uniqueID) {
		
		setWeightKg(weightKg);
		setManufacturingPriceDollars(manufacturingPriceDollars);
		setSuggestedRetailPriceDollars(suggestedRetailPriceDollars);
		setUniqueID(uniqueID);
	}


	/**
	 * @return weightKg
	 */
	public double getWeightKg() 
	{
		return weightKg;
	}


	/**
	 * @param weightKg
	 */
	public void setWeightKg(double weightKg) 
	{
		if(weightKg >= BASE_NUMBER )
		{
			this.weightKg = weightKg;
		}
		else
			throw new IllegalArgumentException("invalid entry");
	}


	/**
	 * @return manufacturingPriceDollars
	 */
	public double getManufacturingPriceDollars() 
	{
		return manufacturingPriceDollars;
	}


	/**
	 * @param manufacturingPriceDollars
	 */
	public void setManufacturingPriceDollars(double manufacturingPriceDollars)
	{
		if(manufacturingPriceDollars >= BASE_NUMBER )
		{
			this.manufacturingPriceDollars = manufacturingPriceDollars;
		}
		else
			throw new IllegalArgumentException("");
	}


	/**
	 * @return suggestedRetailPriceDollars
	 */
	public double getSuggestedRetailPriceDollars() 
	{
		return suggestedRetailPriceDollars;
	}


	/**
	 * @param suggestedRetailPriceDollars
	 */
	public void setSuggestedRetailPriceDollars(double suggestedRetailPriceDollars) 
	{
		if(suggestedRetailPriceDollars >= BASE_NUMBER )
		{
			this.suggestedRetailPriceDollars = suggestedRetailPriceDollars;
		}
		else
			throw new IllegalArgumentException("invalid entry");
	}


	/**
	 * @return uniqueID
	 */
	public String getUniqueID() 
	{
		return uniqueID;
	}


	/**
	 * @param uniqueID
	 */
	public void setUniqueID(String uniqueID)
	{
		if(uniqueID != null && !uniqueID.isEmpty())
		{
			this.uniqueID = uniqueID;
		}
		else
		{
			throw new IllegalArgumentException("invalid entry");
		}
	}
	
	
	

}
