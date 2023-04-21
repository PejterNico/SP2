abstract class AFuelCar extends ACar {

    //// Attributes for the AFuelCar class
    private double kmPrLitre;

    ////Constructor for the AFuelCar class
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, double kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    ////get methods
    public abstract String getFuelType();

    public double getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return "";
    }
}