import java.time.LocalDate;

public class College extends EducationCenter{

    public College() {
        super();
    }

    public College(String name, String locateCountry, LocalDate foundationYear) {
        super(name, locateCountry, foundationYear);
    }

    @Override
    public void getInfo() {
        System.out.println(" Location: " + locateCountry + ", founded in: " + foundationYear);
    }
}
