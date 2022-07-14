package Model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    public static List<String> carList = new ArrayList<>();

    static {

        String car1 = new VehicleBuild()
                .brandOfVehicle("porsche ")
                .colourOfVehicle("red ")
                .speedLimitOfVehicle(150.00)
                .buildOfVehicle();

        String car2 = new VehicleBuild()
                .brandOfVehicle("ford ")
                .colourOfVehicle("gun metal ")
                .speedLimitOfVehicle(150.00)
                .buildOfVehicle();

        String car3 = new VehicleBuild()
                .brandOfVehicle("ferrari ")
                .colourOfVehicle("purple ").speedLimitOfVehicle(175.00)
                .buildOfVehicle();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

}
