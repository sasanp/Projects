package A01061714.BCIT.Assignment1;

import java.awt.Color;
/**
 * @author Sasan
 *
 */
public class Shoe extends Item{
	
	
	private Material material;
	private int size;
	private Name designer;
	private Department shoeTypeD;
	private Color color;


	/**
	 * @param manufacturingPriceDollars
	 * @param manufacturingPriceDollars
	 * @param manufacturingPriceDollars
	 * @param uniqueID
	 * @param material
	 * @param size
	 * @param designer
	 */
	public Shoe(double weightKg, double manufacturingPriceDollars, double suggestedPriceDollars, String uniqueId,
			 Material material, int size, Name designer, Color color, Department department) {
		super(weightKg, manufacturingPriceDollars, suggestedPriceDollars, uniqueId);
		setMaterial(material);
		setSize(size);
		setDesigner(designer);
		setShoeType(department);
		setColor(color);
	}

	
	
	
	/**
	 * @return material
	 */
	public Material getMaterial()
	{
		return this.material;
	}

	/**
	 * @param material
	 */
	public void setMaterial(Material material) 
	{
			if (material != null) {
				this.material = material;
			}
		
	}

	/**
	 * @return size
	 */
	public int getSize() 
	{
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(int size) 
	{
		if(size >= 0)
		{
			this.size = size;
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	/**
	 * @return designer
	 */
	public Name getDesigner() 
	{
		
		return designer;
	}

	/**
	 * @param designer
	 */
	public void setDesigner(Name designer) 
	{
		
			this.designer = designer;
		
	}
	/**
	 * @return shoeTypeD
	 */
	public Department getShoeType() 
	{
		return shoeTypeD;
	}

	/**
	 * @param shoeTypeD
	 */
	public void setShoeType(Department shoeTypeD) 
	{
		this.shoeTypeD = shoeTypeD;
	}

	/**
	 * @return color
	 */
	public Color getColor() 
	{
		return color;
	}

	/**
	 * @param color
	 */
	public void setColor(Color color) 
	{
			this.color = color;
		
	}


	@Override
	public String toString() {
		return "Shoe [material=" + material + ", size=" + size + ", designer=" + designer + ", shoeTypeD=" + shoeTypeD
				+ ", color=" + color + "]";
	}

}
