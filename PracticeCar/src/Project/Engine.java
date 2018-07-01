//Coded by: Jerahmeel Wilson
//Date: 6/30/18
package Project;

public class Engine extends CarPart{
protected int HorsePower;
protected String Name = "engine";

public void status() {
	if(this.condition > 0) {
		System.out.println("This car's "+ this.Name +" is in good condition.");
	}
	else
		System.out.println("This car's " + this.Name + " is broken!");
}
public void function() {
	System.out.println("This car's engine has a horse power of " + HorsePower+"hp." );
}
}
