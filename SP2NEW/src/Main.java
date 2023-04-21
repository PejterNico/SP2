public class Main {
    public static void main(String[] args) {


        FleetOfCars cars = new FleetOfCars();

        ////The new car objects
        Car e1 = new ElectricCar("DV333333","Tesla","Model Y", 5,70,533);
        Car e2 = new ElectricCar("DF456783","Volkswagen","ID3",5,58,422);

        Car d1 = new DieselCar("ER454647","Volvo", "C70",5,14.5,true);
        Car d2 = new DieselCar("GL123456", "BMW","320d",5,25,false);

        Car g1 = new GasolinCar("FG340921","Hyundai", "i20",5,23.2);
        Car g2 = new GasolinCar("MM098765", "Mazda","MX-5",3,15.7);


        // Here I add the car objects to the arraylist
        cars.addCar(e1);
        cars.addCar(e2);
        cars.addCar(d1);
        cars.addCar(d2);
        cars.addCar(g1);
        cars.addCar(g2);

        //Here I print out the whole fleet of cars + the total fee of the fleet
        System.out.println(cars);

    }
}