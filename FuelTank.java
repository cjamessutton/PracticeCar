package PracticeCar;

public class FuelTank extends CarPart{
	
	public FuelTank(){
		super();
		carPart = "Fuel Tank";
		lifeSpan = 55000;
		
	}
	
	@Override
	public int function (int mile) {
		String fuelType = "regular 87 Octane gas";
		int wear = (lifeSpan - mile)/lifeSpan *100;
		condition = condition - wear;
		
		System.out.println("The appropriate fuel for the"+carPart+" is  "+ fuelType +".");
		System.out.println("The EPA estimated range for the vehicle is "+lifeSpan+" miles.");
		System.out.println("The "+carPart+"'s fuel filter has "+condition+"% life remaining.");
		return condition;
	}

}