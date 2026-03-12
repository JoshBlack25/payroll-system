package za.ac.cput.domain;

public class Position {

    private String positionCode;
    private PositionStatus status;

    public String getPositionCode(){
        return positionCode;
    }

    public PositionStatus getStatus(){
        return status;
    }

    private Position(Builder builder){
        this.positionCode = builder.positionCode;
        this.status = builder.status;
    }

    public static class Builder{
        private String positionCode;
        private PositionStatus status;

        public Builder setPositionCode(String positionCode){
            this.positionCode = positionCode;
            return this;
        }

        public Builder setStatus(PositionStatus status){
            this.status = status;
            return this;
        }

        public Position build(){
            return  new Position(this);
        }
    }
}
