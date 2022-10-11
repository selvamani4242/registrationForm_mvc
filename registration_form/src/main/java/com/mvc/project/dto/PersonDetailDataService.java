package com.mvc.project.dto;

import java.util.ArrayList;

public class PersonDetailDataService {


    public ArrayList<PersonDetail> getPersondetails(){

        ArrayList<PersonDetail> personDetail = new ArrayList<>();
        PersonDetail personDetails1 = new PersonDetail();
        personDetails1.setId(1);
        personDetails1.setName("selva");
        personDetails1.setAge(25);
        personDetails1.setCompany("TCS");

        PersonDetail personDetails2 = new PersonDetail();
        personDetails2.setId(2);
        personDetails2.setName("Dinesh");
        personDetails2.setAge(22);
        personDetails2.setCompany("flex");

        PersonDetail personDetails3 = new PersonDetail();
        personDetails3.setId(3);
        personDetails3.setName("raju");
        personDetails3.setAge(22);
        personDetails3.setCompany("wipro");

        PersonDetail personinfo = new PersonDetail();
        personinfo.setInfo("Details not Available");

        personDetail.add(personDetails1);
        personDetail.add(personDetails2);
        personDetail.add(personDetails3);
        personDetail.add(personinfo);
        return personDetail;


    }

}
