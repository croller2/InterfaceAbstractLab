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
        
        ProgrammingClass[] FallProgrammingOfferings = {
           new IntroJavaCourse("Introduction to Java Programming", "183-621", "Introduction to Computer Programming"),
           new AdvancedJavaCourse("Advanced Java" , "189-631", "Introduction to Java Programming"),
           new IntroToProgrammingCourse("Introduction to Computer Programming" , "180-189", "none")
        };
        
        System.out.println("The Programming Course offerings at WCTC for Fall 2016 include:");
        for(ProgrammingClass pc : FallProgrammingOfferings){
            System.out.println("Course: " + pc.getCourseName() + ", course number: " + pc.getCourseNumber() );
            System.out.println("Major Learning Objective: " + pc.majorLearningObjective());
        }
    }
}
