import java.time.LocalDate;

public class University extends EducationCenter{

    public University() {
        super();
    }

    public University(String name, String locateCountry, LocalDate foundationYear) {
        super(name, locateCountry, foundationYear);
    }

    @Override
    public void getInfo() {
        System.out.println(" Location: " + locateCountry + ", founded in: " + foundationYear);
    }

}
