package A01061714.BCIT.Assignment1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sasan
 *
 */
public enum Material {

	
	PLASTIC("plastic"), LEATHER("leather"), RUBBER("rubber"), 
	CLOTH("cloth");

    private String theMaterial;

  
    private static Map<String, Material> lookup = new HashMap<String, Material>();
      
    static
    
    {
        for (Material a : Material.values())
        {
            lookup.put(a.getMaterial(), a);
        }
    }

    /**
     * @param theMaterial
     */
    private Material(String theMaterial) 
    {
        this.theMaterial = theMaterial;
    }

    /**
     * @return theMaterial
     */
    public String getMaterial() 
    {
        return theMaterial;
    }

 
    /**
     * @param theMaterial
     * @return theMaterial
     */
    public static Material get(String theMaterial) {
        return lookup.get(theMaterial);
    }

}
