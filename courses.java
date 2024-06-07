/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courses;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class courses{
    

    private static final String[][] courses = {
        {"BSE", "Software Engineering", "900,000"},
        {"BIT", "Information Technology", "750,000"},
        {"BCS", "Computer Science", "800,000"},
        {"BCE", "Computer Engineering", "950,000"}
    }; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the CourseID: ");
        String courseID = scanner.nextLine().toUpperCase(); 

        String courseDetails = getCourseDetails(courseID);
        System.out.println(courseDetails);
    } 

    public static String getCourseDetails(String courseID) {
        for (String[] course : courses) {
            if (course[0].equals(courseID)) {
                return "Course: " + course[1] + "\nTuition: " + course[2];
            }
        }
        return "Wrong CourseID details";
    }
}

