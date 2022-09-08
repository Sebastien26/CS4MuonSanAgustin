/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muonlecture;
import java.util.Scanner;
/**
 *
 * @author MUON
 */
public class MuonLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String subject1 = "Biology";
        double grade1 = 1.00;
        String teacher1 = "Ma'am Aileen";
        System.out.println("Subject 1");
        System.out.println("Name: " + subject1);
        System.out.println("Grade: " + grade1);
        System.out.println("Teacher: " + teacher1);
        
        String subject2 = "Chemistry";
        double grade2 = 1.25;
        String teacher2 = "Ma'am Morales";
        System.out.println(" ");
        System.out.println("Subject 2");
        System.out.println("Name: " + subject2);
        System.out.println("Grade: " + grade2);
        System.out.println("Teacher: " + teacher2);
        
        String subject3 = "Physics";
        double grade3 = 1.25;
        String teacher3 = "Sir Neil";
        System.out.println(" ");
        System.out.println("Subject 3");
        System.out.println("Name: " + subject3);
        System.out.println("Grade: " + grade3);
        System.out.println("Teacher: " + teacher3);
        
        System.out.println(" ");
        double averageGrade = (grade1 + grade2 + grade3)/3;
        System.out.printf("Average Grade of the Subjects: %.2f",averageGrade);
        System.out.println(" ");
        boolean sameGrade = (grade2 == grade3);
        boolean sameTeacher = (teacher1 == teacher2);
        System.out.println("I have the same Chemistry and Physics Grade: " + sameGrade);
        System.out.println("I have the same Biology and Chemistry teacher: " + sameTeacher);
        Scanner sc = new Scanner(System.in);
    }
    
}
