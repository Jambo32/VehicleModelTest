package Model;

public class VehicleBuild {

    private String brand;
    private String colour;
    private int age;
    private double speedLimit;

    public VehicleBuild brandOfVehicle(String brand) {

        this.brand = brand;
        return this;
    }

    public VehicleBuild colourOfVehicle(String colour) {

        this.colour = colour;
        return this;
    }

    public VehicleBuild ageOfVehicle(int age) {

        this.age = age;
        return this;
    }

    public VehicleBuild speedLimitOfVehicle(double speedLimit) {

        this.speedLimit = speedLimit;
        return this;
    }

    public String buildOfVehicle() {

        String vehicleSpecs = brand + colour + age + speedLimit;
        return vehicleSpecs;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "VehicleBuild{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", speedLimit=" + speedLimit +
                '}';
    }
}
