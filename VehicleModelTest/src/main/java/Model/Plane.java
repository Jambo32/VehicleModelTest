package Model;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    public static List<String> listOfPlanes = new ArrayList<>();

    static {

        String plane1 = new VehicleBuild()
                .brandOfVehicle("boeing")
                .colourOfVehicle("white")
                .speedLimitOfVehicle(450.00)
                .buildOfVehicle();

        listOfPlanes.add(plane1);
    }


}
