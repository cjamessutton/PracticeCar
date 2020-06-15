package PracticeCar;


public class Transmission extends CarPart{
	public Transmission(){
		super();
		carPart = "transmission";
		lifeSpan = 65000;
		
	}
	
	@Override
	public int function (int mile) {
		String trans = "6-speed manual";
		int wear = (lifeSpan - mile)/lifeSpan *100;
		condition -= wear;
		
		System.out.println("The "+carPart+" is a "+ trans +".");
		System.out.println("The "+carPart+" fluid has "+condition+"% remaining.");
		return condition;
	}
	
}