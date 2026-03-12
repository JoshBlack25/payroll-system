package za.ac.cput.factory;

import za.ac.cput.domain.Identity;

public class IdentityFactory {
    public static Identity createIdentity(String identityType,
                                          String value) {
        if (identityType == null || identityType.isEmpty()) {
            return null;
        }

        if(value == null || value.isEmpty()){
            return null;
        }

        return new Identity.Builder()
                .setIdentityType(identityType)
                .setValue(value)
                .build();

    }
}
