package com.igate.labs;//Question
//        1
//        Stream API 1
//        Description
//        Solve the following queries using stream API for the classes.

//Questions :

// 1. Return the list of names of the owners currently having no cars

// 2. create a map of name of person and number of cars he/she owns

// 3. List cars not owned by any one


import java.sql.Date;
import java.util.List;


public class Car {



    int carid;

    String model;

    String company;

    Date rcDate;

    String carNumber;



    public Car(int carid, String model, String company, Date rcDate, String carNumber) {

        super();

        this.carid = carid;

        this.model = model;

        this.company = company;

        this.rcDate = rcDate;

        this.carNumber = carNumber;

    }



    @Override

    public String toString() {

        return "Car [carid=" + carid + ", model=" + model + ", company=" + company + ", rcDate=" + rcDate

                + ", carNumber=" + carNumber + "]";

    }



    public int getCarid() {

        return carid;

    }



    public void setCarid(int carid) {

        this.carid = carid;

    }



    public String getModel() {

        return model;

    }



    public void setModel(String model) {

        this.model = model;

    }



    public String getCompany() {

        return company;

    }



    public void setCompany(String company) {

        this.company = company;

    }



    public Date getRcDate() {

        return rcDate;

    }



    public void setRcDate(Date rcDate) {

        this.rcDate = rcDate;

    }



    public String getCarNumber() {

        return carNumber;

    }



    public void setCarNumber(String carNumber) {

        this.carNumber = carNumber;

    }
}

