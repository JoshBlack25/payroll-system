package za.ac.cput.factory;

import za.ac.cput.domain.*;
import java.util.List;

public class EmployeeFactory {

    public static Employee createEmployee(String empNum,
                                          String name,
                                          EmploymentType employmentType,
                                          String nationality,
                                          ContactDetails contactDetails,
                                          Address address,
                                          Position position,
                                          List<Identity> identities){

        if(empNum == null || empNum.isEmpty()){
            return null;
        }

        if(name == null || name.isEmpty()){
            return null;
        }

        if (employmentType == null){
            return null;
        }

        if (nationality == null || nationality.isEmpty()){
            return null;
        }

        if (contactDetails == null){
            return null;
        }

        if (address == null){
            return null;
        }

        return new Employee.Builder()
                .setEmpNum(empNum)
                .setName(name)
                .setEmploymentType(employmentType)
                .setNationality(nationality)
                .setContactDetails(contactDetails)
                .setAddress(address)
                .setPosition(position)
                .setIdentities(identities)
                .build();
    }
}
