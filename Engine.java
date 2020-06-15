package PracticeCar;

public class Engine extends CarPart{
    
    public Engine(){
        super();
        carPart = "Engine";
        lifeSpan = 7000;
        
    }
    
    @Override
    public int function (int mile) {
        String engType = "Turbo inline 4-cylinder";
        int wear = ((lifeSpan - mile)/lifeSpan) *100;
        condition -= wear;      
        System.out.println("The "+ carPart+" is a " + engType + ".");
        System.out.println("The "+ carPart+"'s oil is at " + condition + "%.");
        return condition;
  
    }


}