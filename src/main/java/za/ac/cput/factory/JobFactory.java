package za.ac.cput.factory;

import za.ac.cput.domain.Job;
import za.ac.cput.domain.Position;
import java.util.List;

public class JobFactory {

    public static Job createJob(String title, List<Position> positions){
        if(title == null || title.isEmpty()){
            return null;
        }

        return new Job.Builder()
                .setTitle(title)
                .setPositions(positions)
                .build();
    }
}
