package za.ac.cput.domain;

import java.util.List;

public class Job {

    private String title;
    private List<Position> positions;

    public String getTitle(){
        return title;
    }

    public List<Position> getPositions() {
        return positions;
    }

    private Job(Builder builder){
        this.title = builder.title;
        this.positions = builder.positions;
    }

    public static class Builder{
        private String title;
        private List<Position> positions;

        public Builder setTitle(String title){
            this.title = title;
            return this;
        }

        public Builder setPositions(List<Position> positions){
            this.positions = positions;
            return this;
        }

        public Job build(){
            return new Job(this);
        }
    }

}
