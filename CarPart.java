package PracticeCar;


public class CarPart implements Durability {
  int condition;
  String carPart;
  int lifeSpan;

  public CarPart(){
    condition = 100;
    carPart = "carPart";
    int lifeSpan;
    int wear = 0;
    
  }

  public void status(){
    System.out.println("The " + carPart + " is in " + condition +"% condition.");
  }

  public int function(int wear){
    condition = condition - wear;
    return condition;
  }
}