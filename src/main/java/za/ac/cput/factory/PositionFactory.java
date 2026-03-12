package za.ac.cput.factory;

import za.ac.cput.domain.*;

public class PositionFactory {

    public static Position createPosition(String positionCode,
                                         PositionStatus status){
        if(positionCode == null || positionCode.isEmpty()){
            return null;
        }

        if(status == null) {
            return null;
        }

        return new Position.Builder()
                .setPositionCode(positionCode)
                .setStatus(status)
                .build();
    }
}
