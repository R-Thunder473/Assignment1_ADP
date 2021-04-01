/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment1_adp;

/**
 *
 * @author Mogammad Faeedh Daniels
 * @studentNumber 219174288
 */
public class Car {
    
    private String make, model, carType;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Program{" + "make=" + make + ", model=" + model + ", carType=" + carType + '}';
    }

}
