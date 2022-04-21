package Question1;

public class Teacher extends Person {
    // data fields
    private int numCourses = 0;
    private String[] courses = new String[4];

    // no arg constructor
    public Teacher() {}

    // constructor to set name and address
    public Teacher(String name, String address) {
        setName(name);
        setAddress(address);
    }

    // tests for duplicate course, does not add duplicate
    public boolean addCourse(String course) {
        boolean result = false;
        boolean test = true;
        for (int i = 0; i < courses.length; i++) {
            if (course.equals(courses[i])) {
                test = false;
                break;
            }
        }
        if (test) {
            courses[numCourses] = course;
            numCourses++;
            result = true;
        }
        return result; 
    }

    // tests for duplicate course, removes all but duplicate
    public boolean removeCourse(String course) {
        boolean result = false;
        boolean test = true;
        numCourses = 0;
        courses[numCourses] = "0";
        for (int i = 0; i < courses.length; i++) {
            if (course.equals(courses[i])) {
                test = false;
                break;
            }
        }
        numCourses++;
        if (test) {
            courses[numCourses] = course;
            numCourses++;
            result = true;
        }
        courses[numCourses] = "0";
        return result; 
    }

    // convert to string
    @Override
    public String toString() {
        return "Teacher: " + getName() + ": " + getAddress();
    }
}