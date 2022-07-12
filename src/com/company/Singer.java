package com.company;

public class Singer extends Person  {
private String bandName;


    Singer(String name, String designation , String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println( bandName + " самая лучшая группа в России по пение");
    }
    public void playGitar(){
        System.out.println("а так же у них есть те кто играет хорошо в Гитаре");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Name - "+super.getName()+"\n"+"designation - "+super.getDesignation()+"\n"+"getBandName - "+getBandName();
    }
}
