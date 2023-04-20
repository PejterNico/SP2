public class GasolinCar extends AFuelCar {

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, double kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public String getFuelType() {
        return "Gasoline car";
    }

    public double getRegistrationFee(){
        double kmPrLitre = getKmPrLitre();
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 330;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            return 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            return 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            return 5500;
        } else if (kmPrLitre <= 5){ // kmPrLitre er mindre end 5
            return 10470;
        }
        return kmPrLitre;
    }
    @Override
    public String toString(){

        return  "This car is a: "+ getFuelType() + " " +getRegistrationNumber() + " "+ getMake() +" "+ getModel() +" "+ getNumberOfDoors() +" "+ getKmPrLitre() + " ; The registration fee of this gasoline car is on: " + getRegistrationFee();
    }
}