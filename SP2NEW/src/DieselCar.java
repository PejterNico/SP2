public class DieselCar extends AFuelCar {

    //// Attribute for the AFuelCar class
    private boolean hasParticleFilter;

    ////Constructor for the DieselCar class
    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, double kmPrLiter, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLiter);
        this.hasParticleFilter = hasParticleFilter;
    }


    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }


    public String getFuelType() {
        return "Diesel car";
    }

    //// Method that calculates the fee depending on the kmPrLiter
    public double getRegistrationFee() {
        double kmPrLiter = getKmPrLitre();
        boolean partikel = hasParticleFilter();
        if (partikel == true) {
            if (kmPrLiter >= 20 && kmPrLiter <= 50) {
                return 460;
            } else if (kmPrLiter >= 15 && kmPrLiter <= 20) {
                return 2440;
            } else if (kmPrLiter >= 10 && kmPrLiter <= 15) {
                return 4190;
            } else if (kmPrLiter >= 5 && kmPrLiter <= 10) {
                return 8270;
            } else { // kmPrLiter er mindre end 5 // < 5
                return 10470 + 15260;
            }
        } else if (partikel == false) {
            if (kmPrLiter >= 20 && kmPrLiter <= 50) {
                return 1460;
            } else if (kmPrLiter >= 15 && kmPrLiter <= 20) {
                return 3440;
            } else if (kmPrLiter >= 10 && kmPrLiter <= 15) {
                return 5190;
            } else if (kmPrLiter >= 5 && kmPrLiter <= 10) {
                return 9270;
            } else if(kmPrLiter<5){ // kmPrLiter er mindre end 5
                return 26730;
            }
        }
        return kmPrLiter;
    }

    @Override
    public String toString() {
        return "This car is a: " + getFuelType() + " " + getRegistrationNumber() + " " + getMake() + " "+ getModel() + " " +  getNumberOfDoors()+ " " + getKmPrLitre()+ " " + hasParticleFilter()+ " ; The registration fee of this Diesel car is: " + getRegistrationFee();
    }
}