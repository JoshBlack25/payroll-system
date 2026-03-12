package za.ac.cput.domain;

public class Identity {

    private String identityType;
    private String value;

    public String getIdentityType(){
        return identityType;
    }

    public String getValue(){
        return value;
    }

    private Identity(Builder builder){
        this.identityType = builder.identityType;
        this.value = builder.value;
    }

    public static class Builder{
        private String identityType;
        private String value;

        public Builder setIdentityType(String identityType){
            this.identityType = identityType;
            return this;
        }

        public Builder setValue(String value){
            this.value = value;
            return this;
        }

        public Identity build(){
            return new Identity(this);
        }
    }
}
