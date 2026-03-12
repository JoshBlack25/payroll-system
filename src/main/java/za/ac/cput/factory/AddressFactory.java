package za.ac.cput.factory;

import za.ac.cput.domain.Address;

public class AddressFactory {
    public static Address createAddress(String streetAddress,
                                        String postalAddress){
        if(streetAddress == null || streetAddress.isEmpty()){
            return null;
        }

        return new Address.Builder()
                .setStreetAddress(streetAddress)
                .setPostalAddress(postalAddress)
                .build();
    }
}
