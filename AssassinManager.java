
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
		if(Grave == null)
			return "Empty";
		
		String r = "";
		
		AssassinNode f = Grave;
		while(f != null) {
			r += f.name + "\n";
			f = f.next;
		}
		
		return r;
	}
	
	public boolean killRingContains(String name)
	{
		AssassinNode f = front;
		
		while(f != null)
		{
			if(f.name.toLowerCase().equals(name.toLowerCase()))
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
			if(f.name.toLowerCase().equals(name.toLowerCase()))
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
		AssassinNode p = front;
		
		if(front.name.toLowerCase().equals(name.toLowerCase())) {
			if(Grave == null) {
				Grave = new AssassinNode(name,null); // If grave is empty make a new one.
				
				front = front.next;
				
			} else {
				front = front.next;
				
				p.next = Grave;
				Grave = p;
				
				AssassinNode q = front;
			}
		} else {
			if(front.next == null)
				throw new IllegalStateException();	// Check if game is over.
			
			while(p.next != null && !p.next.name.toLowerCase().equals(name.toLowerCase())) { // Goes through names, stops when node with name is next.
				p = p.next;
			}
			
			if(p.next == null)
				throw new IllegalArgumentException(); // Check if name has been found.
			
			AssassinNode f = p.next; // Node storing the victim.
			
			if(p.next.next != null) // Takes victim out of the kill ring.
				p.next = p.next.next;
			else
				p.next = null;
			
			if(Grave == null) {
				Grave = new AssassinNode(name,null); // If grave is empty make a new one.
			} else {
				f.next = Grave;
				Grave = f; // Replace front of grave.
			}
		}
			
			
			
		}
	}