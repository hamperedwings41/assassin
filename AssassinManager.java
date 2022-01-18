
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
	
	public boolean killRingContains(String name)
	{
		AssassinNode f = front;
		while(f != null)
		{
			if(f.name == name )
			{
				return true;
			}
		f = f.next;
		}
		return false;
	}
	
	public boolean graveyardContains(String name)
	{
		AssassinNode f = Grave;
		while(f != null)
		{
			if(f.name == name )
			{
				return true;
			}
		f = f.next;
		}
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
    		return front.name;
    	}
    	return null;
    }
    
	public void kill(String name)
	{	
		if(Grave == null) {
			Grave = new AssassinNode(name,null);
		} else {
			AssassinNode p = front;
			while(p.next != null && p.name.toLowerCase().equals(name.toLowerCase())) {
				p = p.next;
			}
			
			AssassinNode f = Grave;
			while(f.next != null) {
				f = f.next;
			}
			
			
			
		}
	}
}