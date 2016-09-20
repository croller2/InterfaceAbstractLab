package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingClass {
    //All properties are private and accessible with getters and setters
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }
    
    //getters & setters and other methods are final. This is a base concrete class
    //so it helps to guard against open/close issues
    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        this.credits = credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    @Override
    public final String getCourseName() {
        return courseName;
    }
    @Override
    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
}
