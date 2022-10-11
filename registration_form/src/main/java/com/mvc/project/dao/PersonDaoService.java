package com.mvc.project.dao;

import com.mvc.project.dto.PersonDetail;
import com.mvc.project.dto.PersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PersonDaoService {
    @Autowired PersonDetailDataService personDetailDataService;

        public PersonResponse getPersonbyId(int personid){

            ArrayList<PersonDetail> persondetailsbyid = personDetailDataService.getPersondetails();
            Optional<PersonDetail> optionalPersonDetailid= persondetailsbyid.stream().filter(it -> it.getId() == personid).findFirst();
            Boolean hasdata = optionalPersonDetailid.isPresent();

            PersonResponse personResponse = new PersonResponse();

            if (hasdata){
              PersonDetail person = optionalPersonDetailid.get();

               personResponse.setPersonDetail(person);
               personResponse.setExist(true);
            }

            return  personResponse;
        }

}
