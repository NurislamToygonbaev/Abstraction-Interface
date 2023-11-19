import java.time.LocalDate;

public class Student implements Study{
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(){

    }

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.print("Student: " + name + " " + surname + ",Gender: " + gender + ", studying at:");
        educationCenter.getInfo();
    }

    @Override
    public void getStudentsStudyingYear() {
        LocalDate currentDate = LocalDate.now();
        int studyingYear = currentDate.getYear() - dateOfStart.getYear();
        System.out.println("Student: " + name + " " + surname + ", studied during " + studyingYear + " year");
    }
}
