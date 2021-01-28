package com.tts;

public class Car {
    private String transmission;
    private String engineType;
    private int modelYear;

    public Car(){

    }

    public Car (String transmission, int modelYear){
        this.transmission = transmission;
        this.modelYear = modelYear;
    }

    public Car (String transmisson, String engineType, int modelYear){
        this.transmission = transmisson;
        this.modelYear = modelYear;
        this.engineType = engineType;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getEngineType() {
        return engineType;
    }


    public String getTransmission() {
        return transmission;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public boolean hasManual() {
        return transmission.equals("Manual");
    }

    @Override
    public String toString() {
        return "Car{" +
                "transmission='" + transmission + '\'' +
                ", engineType='" + engineType + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }
}
