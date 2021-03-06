package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse {
    
    //All properties are private and accessible with getters and setters
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    //Constructor is public and open
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
    //getters & setters and other methods are final. This is a base concrete class
    //so it helps to guard against open/close issues
    @Override
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    @Override
    public final double getCredits() {
        return credits;
    }
    
    @Override
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    @Override
    public final String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public final void goToClass(){
        //Below are stateements for doing something
        System.out.println("Get your Raspberry PI");
        System.out.println("Format Your SD Card");
        System.out.println("Do things with it");
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    
}
