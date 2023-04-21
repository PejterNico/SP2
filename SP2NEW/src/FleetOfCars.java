import java.util.ArrayList;

public class FleetOfCars {

    ////Initialised the arry that holds the car objekt.
    static ArrayList<Car> fleet = new ArrayList<>();

    ////Add method that add the Car objects to the array
    public static void addCar(Car car){
        fleet.add(car);

    }
    ////Mehtod that calculates the whole fee of the fleet
    public double getTotalRegistrationFeeForFleet(){
        double totalFee = 0;
        for (Car car : fleet) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;

    }

    ////toSring method that display how the fleet looks when it is printed out from main.
    @Override
    public String toString(){
        String s = "The list of the cars in the fleet is: " + "\n" ;
        for (Car car : fleet){
            s += car.toString() + "\n";
        }
        return s + "\n" + "The total fee of the fleet is" + " " + getTotalRegistrationFeeForFleet();
    }
}