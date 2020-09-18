package A01061714.BCIT.Assignment1;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Sasan
 *
 */
public enum Department {
	
	
	WOMEN("women"), MEN("men"), CHILDREN("children"), 
	SPORTS("sports"), DRESS("dress");

    private String department;

    private static Map<String, Department> lookup = new HashMap<String, Department>();
      
    static
    
    {
        for (Department department : Department.values())
        {
            lookup.put(department.getDepartment(), department);
        }
    }

    /**
     * @param theShoeType
     */
    private Department(String department) 
    {
        this.department = department;
    }

    /**
     * @return theShoeType
     */
    public String getDepartment() 
    {
        return this.department;
    }

 
    /**
     * @param theShoeType
     * @return lookup.get(theShoeType)
     */
    public static Department get(String department) {
        return lookup.get(department);
    }
}
