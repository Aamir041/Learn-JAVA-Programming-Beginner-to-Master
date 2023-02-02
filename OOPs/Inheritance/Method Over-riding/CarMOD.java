class Car{
	
	public void Start(){
	    System.out.println("\nFuel OK\n"+"Piston OK\n" + "Car Started");		
	}
	public void Accelerate(){
		System.out.println("\nPiston Speed Increased" + "\nAcceleration Acheived");
	}

	public void changeGear(){
		System.out.println("Gear Changed");
	}

}

class ElecCar extends Car{

	@Override
	public void Start(){
	    System.out.println("\nBattery OK\n"+"Electrodes OK\n" + "Car Started");		
	}

	@Override
	public void Accelerate(){
		System.out.println("\nElectron Discharge Increased" + "\nAcceleration Acheived");
	}

	@Override
	public void changeGear(){
		System.out.println("No Gear Here");
	}

	public void openRoof(){
		System.out.println("Roof Opened");
	}

}

public class CarMOD{
	public static void main(String[] args){
		
		System.out.println("Normal Car");
		Car c1 = new Car();
		c1.Start();
		c1.Accelerate();
		c1.changeGear();

		System.out.println();

		System.out.println("Electric Car");
		ElecCar ec1 = new ElecCar();
		ec1.Start();
		ec1.Accelerate();
		ec1.changeGear();
		ec1.openRoof();
	}
}