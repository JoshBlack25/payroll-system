package za.ac.cput.factory;

import za.ac.cput.domain.ContactDetails;

public class ContactDetailsFactory {
    public static ContactDetails createContactDetails(String cellPhone,
                                                      String email,
                                                      String homeNumber){
        if(cellPhone == null || cellPhone.isEmpty()){
            return null;
        }

        if(email == null || email.isEmpty()){
            return null;
        }
        return new ContactDetails.Builder()
                .setCellPhone(cellPhone)
                .setEmail(email)
                .setHomeNumber(homeNumber)
                .build();
    }
}
