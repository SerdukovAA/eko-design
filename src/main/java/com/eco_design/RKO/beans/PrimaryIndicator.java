package com.eco_design.RKO.beans;

/**
 * Created by serdukovaa on 01.06.2015.
 */
public abstract class PrimaryIndicator implements PrimaryIndicatorInterface{

    private int id; //Unik ID PrimaryIndicator for DataBase;
    private int kind_id;// kind id PrimaryIndicator
    final String name; //finali primary indicator
    private double value; //value of primary indicator
    private int ball; //ball by value of primary indicator
    private InfoSource infoSource; //link to info source


    protected PrimaryIndicator(String name, int kind_id){
        this.name = name;
        this.kind_id =kind_id;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getBall() {
        return ball;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value, InfoSource infoSource) {
        this.value = value;
        this.infoSource = infoSource;
        this.ball = returnBall(value);
    }

    public InfoSource getInfoSource() {
        return infoSource;
    }

    public abstract int returnBall(double val);


}
