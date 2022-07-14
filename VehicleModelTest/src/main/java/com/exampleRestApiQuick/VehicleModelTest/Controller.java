package com.exampleRestApiQuick.VehicleModelTest;

import Model.Plane;
import Model.VehicleBuild;
import Model.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Value("${api.version}")
    public String version;

    @GetMapping("/getVersion")
    public String getVersion() {
        return version;
    }

    @GetMapping("/get/carList")
    public List<String> getCarList() {

        return Car.carList;
    }

    @GetMapping("/get/planeList")
    public List<String> getPlaneList(){

        return Plane.listOfPlanes;
    }

    @GetMapping("/getVehicle")
    public String getVehicle() {

        String car1 = new VehicleBuild()
                .brandOfVehicle("bmw ")
                .ageOfVehicle(2003)
                .colourOfVehicle("silver ")
                .speedLimitOfVehicle(125.00)
                .buildOfVehicle();

        return car1;
    }

    @PostMapping("/Vehicle/send")
    public String savingVehicle() {
        String newCar = new VehicleBuild()
                .brandOfVehicle("dodge challenger")
                .colourOfVehicle("black")
                .speedLimitOfVehicle(125.00)
                .buildOfVehicle();

        return " saving the vehicle to the database " + newCar;
    }

    @PutMapping("/Vehicle/update")
    public String updatingVehicle() {

        System.out.println("updating the vehicle");
        return "updating the vehicle to the database";
    }

    @DeleteMapping("/Vehicle/Delete")
    public String deleteVehicle() {
        return "deleting the vehicle in the database";
    }

    }

