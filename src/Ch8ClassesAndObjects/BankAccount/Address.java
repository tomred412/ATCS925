package Ch8ClassesAndObjects.BankAccount;

public class Address {
    private int buildingNumber, zipCode;
    private String street, apartment, city, state, country;

    //constructors
    public Address(int buildingNumber, String street, String apartment, String city, String state, int zipCode, String country) {
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
        this.street = street;
        this.apartment = apartment;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Address(int buildingNumber, String street, String city, String state, int zipCode, String country) {
        this(buildingNumber, street, null, city, state, zipCode, country);
    }

    //getters
    public int getBuildingNumber() {
        return buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getApartment() {
        return apartment;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }
    //setters

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setAddress(int buildingNumber, String street, String apartment, String city, String state, int zipCode, String country) {
        new Address(buildingNumber, street, apartment, city, state, zipCode, country);
    }
    
    public void setAddress(int buildingNumber, String street, String city, String state, int zipCode, String country) {
        new Address(buildingNumber, street, null, city, state, zipCode, country);
    }

    public String toString() {
        return (apartment == null) ? buildingNumber + " " + street + ", " + city + ", " + state + ", " + country + " " + zipCode : buildingNumber + " " + street + ", " + apartment + ", " + city + ", " + state + ", " + country + " " + zipCode;
    }
}
