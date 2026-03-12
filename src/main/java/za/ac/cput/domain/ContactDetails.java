package za.ac.cput.domain;

public class ContactDetails {

    private String cellPhone;
    private String email;
    private String homeNumber;

    public String getCellPhone(){
        return cellPhone;
    }

    public String getEmail(){
        return email;
    }

    public String getHomeNumber(){
        return homeNumber;
    }

    private ContactDetails(Builder builder){
        this.cellPhone = builder.cellPhone;
        this.email = builder.email;
        this.homeNumber = builder.homeNumber;
    }
    public static class Builder{
        private String cellPhone;
        private String email;
        private String homeNumber;

        public Builder setCellPhone(String cellPhone){
            this.cellPhone = cellPhone;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setHomeNumber(String homeNumber){
            this.homeNumber = homeNumber;
            return this;
        }

        public ContactDetails build(){
            return new ContactDetails(this);
        }
    }
}
