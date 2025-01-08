public class Car{
  String make;
 String model;
int year;

public Car(String make,String model , int year){
this.make = make;
this.model=model;
this.year=year;
}
public void displayCarDetails(){
    System.out.println("make : " +make);
    System.out.println("model:"+model);
    System.out.println("year:" +year);
}
}