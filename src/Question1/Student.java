package Question1;

public class Student extends Person {
    // data fields
    private int numCourses = 0;
    private String[] courses = new String[4];
    private int[] grades = new int[4];

    // no arg constructor
    public Student() {}

    // constructor to set name and address
    public Student(String name, String address) {
        setName(name);
        setAddress(address);
    }

    // adds courses and grades to array
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    // prints courses and grades
    public void printGrades() {
        System.out.println(toString());
        for (int i = 0; i < numCourses; i++) {
            System.out.printf("%s: %d\n", courses[i], grades[i]);
        }
        System.out.println();
    }

    // gets average of grades
    public double getAverageGrade() {
        double sum = 0.0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return sum / numCourses;
    }

    // convert to string
    @Override
    public String toString() {
        return "Student: " + getName() + ": " + getAddress();
    }
}