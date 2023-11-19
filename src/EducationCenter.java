import java.time.LocalDate;

public abstract class EducationCenter {
    protected String name;
    protected String locateCountry;
    protected LocalDate foundationYear;

    public EducationCenter(){

    }

    public EducationCenter(String name, String locateCountry, LocalDate foundationYear) {
        this.name = name;
        this.locateCountry = locateCountry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocateCountry() {
        return locateCountry;
    }

    public void setLocateCountry(String locateCountry) {
        this.locateCountry = locateCountry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    public abstract void getInfo();

}
