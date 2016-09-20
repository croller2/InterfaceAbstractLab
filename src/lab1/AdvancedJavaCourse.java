package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingClass {
    //All properties are private and accessible with getters and setters
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
    }
    //getters & setters and other methods are final. This is a base concrete class
    //so it helps to guard against open/close issues
    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
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
    public final String getCourseNumber() {
        return courseNumber;
    }
    @Override
    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    public final void setCredits() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public final double getCredits() {
        return this.credits;
    }

    @Override
    public String majorLearningObjective() {
        return("You get to learn about Encapsulation, Inheritence and Polymorphism!");
    }

 
}
