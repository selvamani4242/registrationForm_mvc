package com.mvc.project.dto;

public class PersonResponse {


    PersonDetail personDetail;
    boolean exist;

    public PersonDetail getPersonDetail() {
        return personDetail;
    }

    public void setPersonDetail(PersonDetail personDetail) {
        this.personDetail = personDetail;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }


}
