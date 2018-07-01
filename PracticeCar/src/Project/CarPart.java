//Coded by: Jerahmeel Wilson
//Date: 6/30/18
package Project;
import java.util.*;

// CarPart objects, implements Functional interface that adds a function() method
public class CarPart implements Functional {
	protected int condition = 100; 
	
	// Prints the status of a Car part
	public void status() {
		if(condition > 0) {
			System.out.println("This car part is in  good condition");
		}
		else
			System.out.println("This car part is broken");
	}
	

	//Overidden 
	public void function() {
		System.out.println("This CarPart has no function");
	}

	
}
