
//Coded by: Jerahmeel Wilson
//Date: 6/30/18
package Project;
import java.util.*;
//Car class, models a car that can any number of Car parts and a name.
//CarParts are represented as objects
public class Car {
 //Reference: Each car has a list of parts stored in an arraylist collection.
 private List<CarPart> Reference = new ArrayList<CarPart>();
 

 private Engine engine;
 private Brakes brakes;
 private AirConditioning air;
 private Wheels wheels;
 private String name;
 
 //Car constructor uses n for name and uses values to be used to create new parts (HorsePower, Padlength, Vents, Size)
 //after new part is created with the value given the part is added to a list of CarPart objects.
 public Car(String n,int HorsePower, double Padlength, int Vents, int Size ) {
	 
	 engine = new Engine();
	 engine.HorsePower = HorsePower;
	 Reference.add(engine);
	 
	 brakes = new Brakes();
	 brakes.Padlength = Padlength;
	 Reference.add(brakes);
	 
	 air = new AirConditioning();
	 air.Vents = Vents;
	 Reference.add(air);
	 
	 wheels = new Wheels();
	 wheels.Size = Size;
	 Reference.add(wheels);
	 
	 this.name = n;
 }
 
 	//Gets the name of the car
	public String getName() {
		return this.name;
	}
	//Starts the car, and performs a checklist.
	public void run() {
		System.out.println(this.getName()+" is Running");
		CheckList();
	}
	
	//Runs the status, and function methods on each CarPart object.
	public void CheckList() {
		for (int i = 0; i<Reference.size(); i++) {
			Reference.get(i).status();
			Reference.get(i).function();
		}
	}
	//Set condition variable to zero if car a part takes damage.
	public void damage(int part) {
		for (int i = 0; i<Reference.size(); i++) {
			if(part == i) {
				Reference.get(i).condition =0;
			}
			
		}	
	}

}
