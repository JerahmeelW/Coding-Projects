//Coded by: Jerahmeel Wilson
//Date: 6/30/18
package Project;

public class Brakes extends CarPart {
protected double Padlength;
protected String Name = "brakes";

public void status() {
	if(this.condition > 0) {
		System.out.println("This car's "+ this.Name +" are in good condition.");
	}
	else
		System.out.println("This car's " + this.Name + " are broken!");
}
public void function() {
	System.out.println("This car's brake pads are "+ Padlength +"mm in length.");
}


}
