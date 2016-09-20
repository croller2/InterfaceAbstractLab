/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author chris
 */
public class Driver {
    public static void main(String[] args) {
        //Instantiate as super class allowing for any type of substitution needed
        ProgrammingClass[] FallProgrammingOfferings = {
           new IntroJavaCourse("Introduction to Java Programming", "183-621", "Introduction to Computer Programming"),
           new AdvancedJavaCourse("Advanced Java" , "189-631", "Introduction to Java Programming"),
           new IntroToProgrammingCourse("Introduction to Computer Programming" , "180-189", "none")
        };
        
        //Because they're all base class we can cycle through using a for each and do things with them
        System.out.println("The Programming Course offerings at WCTC for Fall 2016 include:");
        for(ProgrammingClass pc : FallProgrammingOfferings){
            System.out.println("Course: " + pc.getCourseName() + ", course number: " + pc.getCourseNumber() );
            System.out.println("Major Learning Objective: " + pc.majorLearningObjective());
        }
        
        //If you wanted to utilize just a child class in a manner that's congruent with a single child than you could intialize as a child class
        IntroToProgrammingCourse introClass = new IntroToProgrammingCourse("Introduction To Programming" ,"156789", "none");
        introClass.goToClass();
        
    }
}
