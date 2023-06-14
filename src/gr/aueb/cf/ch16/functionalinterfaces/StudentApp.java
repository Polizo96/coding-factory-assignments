package gr.aueb.cf.ch16.functionalinterfaces;

public class StudentApp {

    public static void main(String[] args) {

    }

    public static void printStudents(Student[] students, IDChecker checker) {
        for (Student student : students) {
            if (checker.checkId(student)) {
                System.out.println(student);
            }
        }
    }
}
