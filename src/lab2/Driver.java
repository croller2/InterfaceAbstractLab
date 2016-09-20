/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


/**
 *
 * @author chris
 */
public class Driver {
    public static void main(String[] args) {
           //All utilize Substitution, we can do whatever we want because they're all base class
        ProgrammingClass AdvJava = new AdvancedJavaCourse("Advanced Java" , "182-678");
        ProgrammingClass IntroJava = new IntroJavaCourse("Introduction to Java Programming" , "182-789");
        ProgrammingClass IntroProg = new IntroToProgrammingCourse("Introduction to Programming" , "180-456");
    
        //You can add all of them to an array iterate through because they are based off ProgrammingClass super class
        ProgrammingClass[] classList = {AdvJava, IntroJava, IntroProg};
    
        for(ProgrammingClass pc : classList){
            System.out.println("Course Name: " + pc.getCourseName() );
        }
        
        //If you want to instantiate something as a child class:
        IntroToProgrammingCourse IntroProgTwo = new IntroToProgrammingCourse("Introduction to Programming","180-455");
        //You can if you're not going to use it in any way that would be incompatible with other classes. 
        //It's easier to type it as super class though allowing for versatility and reusability
        IntroProgTwo.goToClass();
        
    }
 
}
