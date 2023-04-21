public class ElectricCar extends ACar {

    //// Attributes for the AFuelCar class
    private int batteryCapacity;
    private int maxRangeKm;

    ////Constructor for the ElectricCar class
    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRangeKm = maxRangeKm;
    }


    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    public String getFuelType() {
        return "Electric car";
    }


    public double getWhPrKm() {
        int whkm = batteryCapacity*1000;
        int as = whkm/maxRangeKm;
        double a = as / 91.25;
        double kmPrLitre = 100.0/a;
        return kmPrLitre; // What a electric car runs of 1 liter of "gas"
    }

    //// Method that calculates the fee depending on the kmPrLiter
    public double getRegistrationFee() {
        double whPrKm = getWhPrKm();
        if (whPrKm >= 20 && whPrKm <= 50) {
            return 330;
        } else if (whPrKm >= 15 && whPrKm <= 20) {
            return 1050;
        } else if (whPrKm >= 10 && whPrKm <= 15) {
            return 2340;
        } else if (whPrKm >= 5 && whPrKm <= 10) {
            return 5500;
        } else if (whPrKm < 5 ) { // kmPerLiter is smaller than < 5
            return 10470;
        }
        return whPrKm;
    }

    @Override
    public String toString() {
        return "This car is a: " + getFuelType()+ " " + getRegistrationNumber() +" "+ getMake() +" "+ getModel() + " " + getNumberOfDoors() + " " + getWhPrKm() + " ; The registration fee of this Electric car is: " + getRegistrationFee();
    }
}