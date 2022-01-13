import java.util.List;

public class AssassinManager {
    // YOUR CODE GOES HERE
	private AssassinNode frontkill;
	private AssassinNode frontGrave;
	
	public AssassinManager( List<String> names) {
		for(String i : names) {
			frontkill = new AssassinNode(i,frontkill);
		}
		
	}
	public String killRing() {
		
		String a="";
		AssassinNode e = frontkill;
		while(e.next!=null) {
			System.out.println(e.name);
			a+= e.name + " is stalking " + e.next.name + "\n";
			e = e.next;
		}
		a+= e.name + " is stalking " + frontkill.name + "\n";
		System.out.println(a);
		return a;
	}
	public String graveyard() {
		String a="";
		AssassinNode e= frontGrave;
		 if(e==null) {
			 return "";
		 }
		 while(e.next!=null) {
			 a+=e.name;
		 }
		
		return "";
	}
	public boolean KillRingContains(){
		return true;
	}
	public boolean graveyardContains() {
		return true;
	}
	public boolean isGameOver() {
		return true;
	}
	public String winner() {
		return "";
	}
	public void kill(String name) {
		
	}
	
	
		
	
}



