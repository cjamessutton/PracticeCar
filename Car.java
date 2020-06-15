package PracticeCar;
import java.util.ArrayList;


public class Car{
  int mileage;
  int wear;
  int mile;
  ArrayList<CarPart> cpList = new ArrayList<CarPart>();

  public Car(){
    mileage = 0;
    cpList.add(new Engine());
    cpList.add(new Brakes());
    cpList.add(new FuelTank());
    cpList.add(new Tires());
    cpList.add(new Transmission());
  }

  public int run(int mile){
    mileage += mile;
    System.out.println("The total mileage of the car is now:"+mileage);
    for (CarPart carPart:cpList){
      System.out.println(carPart.function(mile));
    }
    return mileage;
  }
}
