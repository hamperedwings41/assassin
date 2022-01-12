import java.util.*;

public class AssassinManager {
	private AssassinNode front;
	private Node previous;
    public AssassinManager(List<String> names)
    {
    	front  = null;
    	for(String name : names)
    	{
    		new AssassinNode(name);
    	}
    }
    
    public String killring()
    {
    	
		return null;
    	
    }
    
    public String graveyard()
    {
    	return null;
    }
    
    public boolean killringContains()
    {
    	return false;
    }
    
    public boolean graveyeardContains()
    {
    	return false;
    }
    
    public boolean isGameOver()
    {
    	if(front.next == null)
    	{
    		return true;
    	}
    	return false;
    }
    
    public String winner()
    {
    	if(front.next == null)
    	{
    		return front.value;
    	}
    	return null;
    }
    
    public void Kill(String name)
    {
    	
    }

}
