package za.ac.cput.domain;

public class Address {

    private String streetAddress;
    private String postalAddress;

    public String getStreetAddress(){
        return streetAddress;
    }

    public String getPostalAddress(){
        return postalAddress;
    }

    private Address(Builder builder){
        this.streetAddress = builder.streetAddress;
        this.postalAddress = builder.postalAddress;
    }

    public static  class Builder{
        private String streetAddress;
        private String postalAddress;

        public Builder setStreetAddress(String streetAddress){
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder setPostalAddress(String postalAddress){
            this.postalAddress = postalAddress;
            return this;
        }

        public  Address build(){
            return new Address(this);
        }

    }
}
