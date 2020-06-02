package model;

public class PersonEnti {
    private String name;
    private String gender;
    private String countryname;
    private double weight;
    private double price;
    public String getName() {
        return name;
    }

    public PersonEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public PersonEnti setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getCountryname() {
        return countryname;
    }

    public PersonEnti setCountryname(String countryname) {
        this.countryname = countryname;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public PersonEnti setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public PersonEnti setPrice(double price) {
        this.price = price;
        return this;
    }


}
