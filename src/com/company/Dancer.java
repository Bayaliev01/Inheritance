package com.company;

public class Dancer extends Person {
private String groupName;


    Dancer(String name, String designation , String groupName) {
        super(name, designation );
        this.groupName = groupName;
    }
    public void dancing(){
        System.out.println(groupName + " Самая популярная танцевальная группа в Кыргызтане");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "name - "+super.getName()+"\n"+"designation - "+super.getDesignation()+"\n"+"groupName - "+groupName  ;
    }
}
