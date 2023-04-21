abstract class ACar implements Car {

    //// Attributes for the ACar class
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;

    ////Cunstructor for the ACar class
    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    //// Get methods
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "";
    }
}