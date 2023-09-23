import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Enter number of new students to enroll");
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt(); 
        // Creating an ArrayList to hold the information of students
        ArrayList<StudentInfo> students = new ArrayList<>(); 

        for(int n = 0; n < numStudents; n++){
            StudentInfo student = new StudentInfo(); 
            student.enroll();
            student.payTuition();
            students.add(student);
            System.out.println(student.showInfo()); 
        }
    }
}
