package A01061714.BCIT.Assignment1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sasan
 *
 */
public enum BookType { 
	
	
    FICTION("fiction"), NONFICTION("nonfiction"), SCIENCEFICTION("sciencefiction"), 
    REFERENCE("reference");

    private String theBookType;

    private static Map<String, BookType> lookup = new HashMap<String, BookType>();
      
    static
    
    {
        for (BookType b : BookType.values())
        {
            lookup.put(b.getTheBookType(), b);
        }
    }

    /**
     * @param theBookType
     */
    private BookType(String theBookType) 
    {
        this.theBookType = theBookType;
    }

    /**
     * @return theBookType
     */
    public String getTheBookType() 
    {
        return theBookType;
    }


    /**
     * @param theBookType
     * @return
     */
    public static BookType get(String theBookType) {
        return lookup.get(theBookType);
    }
}


