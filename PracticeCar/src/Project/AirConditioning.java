//Coded by: Jerahmeel Wilson
//Date: 6/30/18
package Project;

public class AirConditioning extends CarPart {
	protected int Vents;
	protected String Name = "air conditioning";
	

public void status() {
	if(this.condition > 0) {
		System.out.println("This car's "+ this.Name +" is in good condition.");
	}
	else
		System.out.println("This car's " + this.Name + " is broken!");
}
	public void function() {
		System.out.println("This A/C uses "+ Vents+ " vents.");
	}
}
