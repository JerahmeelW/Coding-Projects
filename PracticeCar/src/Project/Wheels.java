//Coded by: Jerahmeel Wilson
//Date: 6/30/18
package Project;

public class Wheels extends CarPart{
 protected int Size;
 protected String Name = "wheels";

public void status() {
	if(this.condition > 0) {
		System.out.println("This car's "+ this.Name +" are in good condition.");
	}
	else
		System.out.println("This car's " + this.Name + " are flat!");
}

 public void function() {
	 System.out.println("These wheels are "+ Size + " inches in diameter.");
 }
}
