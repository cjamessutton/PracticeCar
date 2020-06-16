package PracticeCar;

public class Brakes extends CarPart{
    
    public Brakes(){
        super();
        carPart = "brake";
        lifeSpan = 35000;
            
    }
    
    @Override
    public int function (int mile) {
    
        double b = mile;
        String brakes = "Anti-lock Braking System";
        double rate = mile / lifeSpan;
        int wear = (int) (( (double) mile/lifeSpan) * 100);
        condition = condition - wear;

        System.out.println("The "+carPart+" system features an "+ brakes +".");
        System.out.println("The "+carPart+" pads have "+condition+"% remaining.");
        System.out.println(wear);
        System.out.println(rate);
        System.out.println (6500/35000*100);
        System.out.println(mile);
        System.out.println(lifeSpan);
        return condition;
    }

}
