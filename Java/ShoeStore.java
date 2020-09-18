package A01061714.BCIT.Assignment1;

import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Sasan
 *
 */

public class ShoeStore extends Store {

	
	public static final int HIGHEST_SHOE_SIZE = 15;
	
	private Department department;
	Collection <Shoe> shoes = null;
	

	
	/**
	 * @param address
	 * @param name
	 */
	public ShoeStore(Address address, String name, String department)
	{
	
		super(address, name);
		this.department = Department.get(department);
		addShoes();
		
	}

	/**
	 * @param address
	 * @param name
	 * @param department
	 */
	public ShoeStore(Address address, String name, Department department)
	{
	
		super(address, name);
		this.department = department;
		addShoes();
		
	}
	//it should be like Bookstore but modified for shoes

	private void addShoes()
	{
   
	
	Name name = new Name("Skechers");
	Department department = Department.MEN;
	Color color = Color.DARK_GRAY;
	Material material = Material.LEATHER;
	Shoe shoe = new Shoe(1, 58.5, 90, "Diameter", material, 10, name, color,department);
	addItem(shoe);
			

    
	name = new Name("Robert", "Cobbler");
	department = Department.DRESS;
	color = Color.BLACK;
	material = Material.LEATHER;
	shoe = new Shoe(1.15, 104, 160, "Wave", material, 12, name, color,department);
	addItem(shoe);
    
    
    
	name = new Name("Geox");
	department = Department.MEN;
	color = Color.BLUE;
	material = Material.CLOTH;
	shoe = new Shoe(1, 110.5, 170, "Monet", material, 7, name, color,department);
	addItem(shoe);
    
   
    
	name = new Name("Nine", "West");
	color = Color.BLACK;
	material = Material.PLASTIC;
	shoe = new Shoe(0.85, 84.5, 130, "Camya Multi Glitter", material, 8, name, color,department);
	addItem(shoe); 
    
    
    
    department = Department.WOMEN;
	color = Color.GRAY;
	material = Material.PLASTIC;
	shoe = new Shoe(0.9, 97.5, 150, "Marieclaire", material, 10, name, color,department);
	addItem(shoe); 
    
    
    
	name = new Name("Stride", "Rite");
	department = Department.CHILDREN;
	color = Color.GRAY;
	material = Material.RUBBER;
	shoe = new Shoe(0.6, 45.5, 70, "Balance Of The Force", material, 9, name, color,department);
	addItem(shoe);
    
    
    
   
	name = new Name("Sperry");
	department = Department.CHILDREN;
	color = Color.ORANGE;
	material = Material.CLOTH;
	shoe = new Shoe(0.7, 39, 39, "Top-Sider Unisex Bluefish H&L", material, 9, name, color,department);
	addItem(shoe);
    
  
    
    
	department = Department.CHILDREN;
	color = Color.PINK;
	material = Material.PLASTIC;
	shoe = new Shoe(0.85, 32.5, 50, "Lite Kicks Rainbow Sprite", material, 10, name, color,department);
	addItem(shoe);
    
  
      
    
	name = new Name("Robert", "Cobbler");
	department = Department.DRESS;
	color = Color.BLACK;
	material = Material.LEATHER;
	shoe = new Shoe(1.15, 104, 160, "Wave", material, 12, name, color,department);
	addItem(shoe);
    
    
    
    name = new Name("Nike");
	department = Department.SPORTS;
	color = Color.WHITE;
	material = Material.RUBBER;
	shoe = new Shoe(1.2, 117, 180, "Jordan Ace 23 II", material, 13, name, color,department);
	addItem(shoe);
    

   
	}
	
	
	/**
	 * displayAllShoesAndDesigners
	 */
	@SuppressWarnings("unchecked")
	public void displayAllShoesAndDesigners()
	{
		shoes = getCollectionOfItems();
		
		if(shoes != null)
		{
			for(Shoe s: shoes)
			{
				// %s anytype with String output
				System.out.println(String.format("%s offers %s size-%d %s's %s", s.getDesigner().getFullName(), 
									s.getMaterial().toString().toLowerCase(),
									s.getSize(),
									s.getShoeType().toString().toLowerCase(), s.getUniqueID()));
			}
		}
		else
		{
			throw new IllegalArgumentException();
		}
		
		
	}

	/**
	 * displayAllShoesByDesigner
	 * @param designerName
	 */
	@SuppressWarnings("unchecked")
	public void displayAllShoesByDesigner(String designerName)
	{
		if(designerName != null && !designerName.isEmpty())
		{
			shoes = getCollectionOfItems();
			
			for(Shoe s : shoes)
			{
				if(s.getDesigner().getFirstName().equals(designerName))
				{
					// %s anytype with String output
					System.out.println(String.format("%s offers a size-%d %s's %s",
										s.getDesigner().getFirstName(), s.getSize(), s.getShoeType().toString().toLowerCase(),
										s.getUniqueID()));
				}
			}
		}
		else
		{
			System.out.println("designer name cannot be null or empty");
		}
	}
	
	
	/**
	 * displayAllShoesMadeOf(Material material)
	 * @param material
	 */
	@SuppressWarnings("unchecked")
	public void displayAllShoesMadeOf(Material material)
	{
		shoes = getCollectionOfItems();
		
		if(material != null)
		{
			for(Shoe s: shoes)
			{
				if(s.getMaterial().equals(material))
				{
					// %s anytype with String output
					System.out.println(String.format("The size-%s %s is made of %s", 
										s.getSize(), s.getUniqueID(), 
										s.getMaterial().toString().toLowerCase()));
				}
			}
		}
		else
			{
				System.out.println("material cannot be null");
			}
		
	}
	
	/**displayAllShoesMadeOf(String material)
	 * @param material
	 */
	@SuppressWarnings("unchecked")
	public void displayAllShoesMadeOf(String material)
	{
		shoes = getCollectionOfItems();
		
		if(material != null && !material.isEmpty())
			{
				System.out.println(Material.get(material));
			}
		
		else
			{
				System.out.println("material cannot be null or empty");
			}
	}
	
	/**
	 * displayNumberOfShoesDesignedBy()
	 * @param designer
	 */
	@SuppressWarnings("unchecked")
	public void displayNumberOfShoesDesignedBy(Name designer)
	{
		int counter  = 0;
		shoes 		 = getCollectionOfItems();
		
		
		if(designer != null)
		{
			for(Shoe s : shoes)
			{
				if(s.getDesigner().getFullName().equals(designer.getFullName()))
				{
					counter++;
				}
				//%d decimal integer %s anytype with String output
				System.out.println(String.format ("This store has %d shoes designed by %s", counter, designer.getFirstName()));;
			}
		}
		else
		{
			System.out.println("designer cannot be null");
		}
		
	}
	
	
	/**
	 * displayNumberOfShoesDesignedBy(String designerLastName)
	 * @param designerLastName
	 */
	@SuppressWarnings("unchecked")
	public void displayNumberOfShoesDesignedBy(String designerLastName)
	{
		int counter = 0;
		shoes = getCollectionOfItems();
		
		if(designerLastName !=null && !designerLastName.isEmpty())
		{
			for(Shoe s: shoes)
			{
				if(s.getDesigner().getLastName().equals(designerLastName))
				{
					counter ++;
				}
				//%d decimal integer %s anytype with String output
				System.out.println(String.format("This store has %d shoes designed by %s", counter, designerLastName));
			}
		}
		else
		{
			System.out.println("designerName cannot be null or empty");
		}
	}
	
	/**
	 * displaySmallestShoeSize()
	 */
	@SuppressWarnings("unchecked")
	public void displaySmallestShoeSize()
	{
		shoes = getCollectionOfItems();
		int shoeSize = HIGHEST_SHOE_SIZE;
		
		for(Shoe s: shoes)
		{
			if(s.getSize() < shoeSize)
			{
				shoeSize = s.getSize();
			}
			
		}
		System.out.println(String.format("smallerst shoe size: %d", shoeSize));
	}
	
	
	
	/**
	 * displayTotalWeightKgOfAllShoes()
	 */
	@SuppressWarnings("unchecked")
	public void displayTotalWeightKgOfAllShoes()
	{
		shoes = getCollectionOfItems();
		
		double weightSumKg = 0.0;
		
		for(Shoe s: shoes)
		{
			weightSumKg += s.getWeightKg();
		}
		// %.2f format float with 2 decimal places
		System.out.println(String.format("total kg of shoes: %.2f", weightSumKg));
	}
	
	/**
	 * displayAllShoesOfThisMaterialMadeByThisDesigner(Material m, Name designer)
	 * @param m
	 * @param designer
	 */
	@SuppressWarnings("unchecked")
	public void displayAllShoesOfThisMaterialMadeByThisDesigner(Material m, Name designer)
	{
		
		shoes = getCollectionOfItems();
		boolean available = true;
		
		if(m != null || designer != null)
		{
			for(Shoe s: shoes)
			{
		
				if(s.getMaterial().equals(m) && s.getDesigner().getFullName().equals(designer.getFullName())) 
		
				{
					available = true;
					System.out.println(String.format("The %s is a %s shoe offered by %s", s.getUniqueID(), 
										s.getMaterial().toString().toLowerCase(), s.getDesigner().getFullName()));
				}
		
			}
		}
		if(!available)
		{
			System.out.println(String.format("This store has %s shoes designed by %s", m.getMaterial(),
								designer.getFullName()));
		}
		else
		{
			System.out.println("invalid entry");
		}
	}
	
	/**
	 * displayAllShoesNotInMatchingStore()
	 */
	@SuppressWarnings("unchecked")
	public void displayAllShoesNotInMatchingStore()
	{
		shoes = getCollectionOfItems();
		Iterator<Shoe> it = shoes.iterator();
		
		while(it.hasNext())
		{
			Shoe s = it.next();
			if(s.getShoeType().equals(department))
			{
				continue;
			}
			else
			{
				System.out.println(String.format("The %s is a %s's shoe offered by %s"
						, s.getUniqueID(), s.getShoeType().getDepartment(), s.getDesigner().getFullName()));
			}
		}
		
	}
}
