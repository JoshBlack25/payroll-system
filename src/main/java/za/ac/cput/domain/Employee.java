package za.ac.cput.domain;

import java.util.List;

public class Employee {

    private String empNum;
    private String name;
    private EmploymentType employmentType;
    private String nationality;
    private ContactDetails contactDetails;
    private Address address;
    private Position position;
    private List<Identity> identities;

    private Employee(Builder builder){
        this.empNum = builder.empNum;
        this.name = builder.name;
        this.employmentType = builder.employmentType;
        this.nationality = builder.nationality;
        this.contactDetails = builder.contactDetails;
        this.address = builder.address;
        this.position = builder.position;
        this.identities = builder.identities;
    }

    public String getEmpNum(){
        return empNum;
    }

    public String getName(){
        return name;
    }

    public String getNationality(){
        return nationality;
    }

    public static class Builder{

        private String empNum;
        private String name;
        private EmploymentType employmentType;
        private String nationality;
        private ContactDetails contactDetails;
        private Address address;
        private Position position;
        private List<Identity> identities;

        public Builder setEmpNum(String empNum){
            this.empNum = empNum;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setEmploymentType(EmploymentType employmentType){
            this.employmentType = employmentType;
            return this;
        }

        public Builder setNationality(String nationality){
            this.nationality = nationality;
            return this;
        }

        public Builder setContactDetails(ContactDetails contactDetails){
            this.contactDetails = contactDetails;
            return this;
        }

        public Builder setAddress(Address address){
            this.address = address;
            return this;
        }

        public Builder setPosition(Position position){
            this.position = position;
            return this;
        }

        public Builder setIdentities(List<Identity> identities){
            this.identities = identities;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
