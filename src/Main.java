import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EducationCenter[] educationCenters = new EducationCenter[3];
        educationCenters[0] = new School("School 98", "city Bishkek", LocalDate.ofYearDay(1985,1));
        educationCenters[1] = new College("College BTK", "city Bishkek", LocalDate.ofYearDay(1960,1));
        educationCenters[2] = new University("University KASI", "city Bishkek", LocalDate.ofYearDay(1930,1));

        Student[] students = new Student[10];
        students[0] = new Student("Nurislam", "Toigonbaev", "male", LocalDate.ofYearDay(2016, 1), educationCenters[2]);
        students[1] = new Student("Nurlan", "Abibillaev", "male", LocalDate.ofYearDay(2022, 1), educationCenters[1]);
        students[2] = new Student("Nurkamil", "Kamchiev", "male", LocalDate.ofYearDay(2019, 1), educationCenters[2]);
        students[3] = new Student("Nurmuhammed", "Medetov", "male", LocalDate.ofYearDay(2020, 1), educationCenters[2]);
        students[4] = new Student("Ajybek", "Sadykov", "male", LocalDate.ofYearDay(2014, 1), educationCenters[0]);
        students[5] = new Student("Eldiyar", "Avazbek uulu", "male", LocalDate.ofYearDay(2013, 1), educationCenters[0]);
        students[6] = new Student("Urmat", "Taichiev", "male", LocalDate.ofYearDay(2021, 1), educationCenters[2]);
        students[7] = new Student("Nurtaazim", "Mukanov", "male", LocalDate.ofYearDay(2022, 1), educationCenters[1]);
        students[8] = new Student("Mirlan", "Arystanbekov", "male", LocalDate.ofYearDay(2019, 1), educationCenters[2]);
        students[9] = new Student("Zhigit", "Turumbekov", "male", LocalDate.ofYearDay(2019, 1), educationCenters[2]);
        
        getStudentInfo(students);
    }

    public static void getStudentInfo(Student[] students){
        for (Student student : students) {
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
            System.out.println();
        }
    }
}