import java.util.List;

public class AssassinManager {
    // YOUR CODE GOES HERE
	private AssassinNode front;
	private AssassinNode Grave;
	
	public AssassinManager( List<String> names) 
	{
		for(String x : names) {
			front = new AssassinNode(x,front);
		}
		
	}
	public String killRing() {
		
		String a = "";
		AssassinNode f = front;
		while(f.next!=null) {
			System.out.println(f.name);
			a += f.name + " is stalking " + f.next.name + "\n";
			f = f.next;
		}
		a += f.name + " is stalking " + front.name + "\n";
		System.out.println(a);
		return a;
	}
	
	public String graveyard() {
		String  bob = "";
		AssassinNode b = Grave;
		 if(b==null) {
			 return "";
		 }
		 while(b.next!=null) {
			 bob += b.name;
		 }
		
		return "";
	}
	
	public boolean KillRingContains()
	{
		return true;
	}
	
	public boolean graveyardContains()
	{
		return true;
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
    		return front.name;
    	}
    	return null;
    }
    
	public void kill(String name)
	{
		
	}
	
	
		
	
}



