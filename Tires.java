package PracticeCar;

public class Tires extends CarPart{
	
	public Tires(){
		super();
		carPart = "tire";
		lifeSpan = 25000;
		
	}
	
	@Override
	public int function (int mile) {
		String tireSize = "225/45R17";
		int wear = (lifeSpan - mile)/lifeSpan *100;
		condition -= wear;
		
		System.out.println("The "+carPart+" size is "+ tireSize +".");
		System.out.println("The "+carPart+" tread has "+condition+"% remaining life.");
		return condition;
	}
}
