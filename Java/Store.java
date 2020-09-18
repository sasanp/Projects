package A01061714.BCIT.Assignment1;

import java.util.Collection;
import java.util.HashMap;
/**
 * @author Sasan
 *
 */
public class Store {

	private Address streetAddress;
	private String name;
	private HashMap<String, Item> itemsForSale;
	
	/**
	 * @param streetAddress
	 * @param name
	 */
	public Store(Address streetAddress, String name) 
	{
		setStreetAddress(streetAddress);
		setName(name);	
		itemsForSale = new HashMap<>();
	}
	
	
	/**
	 * @return itemsForSale
	 */
	public HashMap<String, Item> itemsForSale()
	{
		return itemsForSale;
	}
	
	/**
	 * @param itemsForSale
	 */
	public void setItemsForSale(HashMap<String, Item> itemsForSale)
	{
		this.itemsForSale = itemsForSale;
	}
	
	
    /**
     * @param item
     */
    public void addItem(Item item)
    {
       
		itemsForSale.put(item.getUniqueID(), item);
    }
    
    /**
     * @param key
     * @return itemsForSale
     */
    public Item getItemByKey(String key)
    {
        return itemsForSale.get(key);
    }
    
    
	/**
	 * @return itemsForSale.values()
	 */
    @SuppressWarnings("rawtypes")
	public Collection getCollectionOfItems()
	{
    	return itemsForSale.values();
    }
	

	/**
	 * @return streetAddress
	 */
	public Address getStreetAddress()
	{
		return streetAddress;
	}

	/**
	 * @param streetAddress
	 */
	public void setStreetAddress(Address streetAddress) 
	{
		if (streetAddress != null) 
		{
			this.streetAddress = streetAddress;
		}
		else
		{
			throw new IllegalArgumentException("invalid");
		}
	}

	/**
	 * @return name
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) 
	{
		if (name != null && !name.isEmpty()) 
		{
			this.name = name;
		}
		
		else
		{
			throw new IllegalArgumentException("invalid");
		}
	}


}
