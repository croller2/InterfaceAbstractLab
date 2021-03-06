package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
   //All properties are private and accessible with getters and setters
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.prerequisites = prerequisites;
    }
    
    //getters & setters and other methods are final. This is a base concrete class
    //so it helps to guard against open/close issues
    @Override
    public final String getCourseNumber() {
        return courseNumber;
    }
    @Override
    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    @Override
    public final double getCredits() {
        return credits;
    }

    @Override
    public final String getPrerequisites() {
        return prerequisites;
    }
    @Override
    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    @Override
    public final void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }else{
            this.credits = credits;
        }
    }
    @Override
    public final String getCourseName() {
        return courseName;
    }
    @Override
    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String majorLearningObjective() {
        return("You get to learn about Object Oriented Programming!");
    }

}
