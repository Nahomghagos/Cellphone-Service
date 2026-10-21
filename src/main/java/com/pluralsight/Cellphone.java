package com.pluralsight;

public class Cellphone {
    private int Serialnumber = 100000000-9999999;
    private String model = "iphonex";
    private String phoneNumber= "800-555-5555";
    private String carrier = "AT&T";
    private String owner= "Dana Wyatt";


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSerialnumber() {
        return Serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        Serialnumber = serialnumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Cellphone() {
        Serialnumber = 0;
        this.model = "";
        this.phoneNumber = "";
        this.carrier = "";
        this.owner = "";
    }


}
