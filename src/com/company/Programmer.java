package com.company;

public class Programmer extends Person{
private String companyName;

    Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
public void coding(){
    System.out.println(companyName +" Лучшая компания в мире");
}


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "name - "+super.getName()+"\n"+"Designation - "+super.getDesignation()+"\n"+"CompanyName - "+getCompanyName();
    }
}
