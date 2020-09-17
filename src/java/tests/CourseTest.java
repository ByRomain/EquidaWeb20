/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Course;
/**
 *
 * @author sio2
 */
public class CourseTest {
    
    public static void main(String[] args) {
        
        Course uneCourse = new Course(1,"Le grand prix 200 cc","06/08/20","Toujour chez Maurice",5);
        System.out.println(uneCourse.toString());
        System.out.println(uneCourse.getId() + "  " + uneCourse.getNom()+ " "+ uneCourse.getDate()+ " " + uneCourse.getLieu()+ " " + uneCourse.getPlace());
    }
}
