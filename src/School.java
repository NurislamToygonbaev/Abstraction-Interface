import java.time.LocalDate;

public class School extends EducationCenter{

    public School() {
        super();
    }

    public School(String name, String locateCountry, LocalDate foundationYear) {
        super(name, locateCountry, foundationYear);
    }

    @Override
    public void getInfo() {
        System.out.println(" Location: " + locateCountry + ", founded in: " + foundationYear);
    }

}
