package java_38;

public class Manufacturer {
    private String name;
    private Country country;

    public Manufacturer(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String nameCountry() {
        return this.country.getName();
    }
}
