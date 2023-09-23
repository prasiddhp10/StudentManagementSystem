import java.util.Scanner;


public class StudentInfo {
    private String firstName; 
    private String lastName; 
    private int gradeYear; 
    private String studentID; 
    private String courses = null; 
    private int tuitionBalance = 0; 
    private static int costOfAttendance = 800 ; 
    private static int id = 1000; 

    public StudentInfo(){ 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.println("\n 1. Freshmen \n 2. Sophomore \n 3. Junior \n 4. Senior \n Enter your year : ");
        this.gradeYear = sc.nextInt(); 
        setStudentID();
    }

    private void setStudentID(){
        id++; 
        this.studentID = (gradeYear + "" + id); 
    }

    public void enroll(){
        do {
            System.out.println("Enter course to enroll (Q to quit) : ");
            Scanner sc = new Scanner(System.in); 
            String course = sc.nextLine(); 
            if (!course.equalsIgnoreCase("Q")) {
                courses = courses + "\n" + course; 
                tuitionBalance = tuitionBalance + costOfAttendance; 
            }
            else { 
                System.out.println("Pressed Q!");
                break; 
            }
        } while (1 != 0);
    }

    public void viewBalance(){
        System.out.println("Your tuition balance is : $ " +tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter total amount of payment");
        Scanner sc = new Scanner(System.in); 
        int Payment = sc.nextInt(); 
        tuitionBalance = tuitionBalance - Payment; 
        System.out.println("Thank you for your payment of : $ " + Payment);
        viewBalance();
    }

    public String showInfo(){
        return "Name : " + firstName + " " + lastName + "\nGrade Level : " + gradeYear+ "\nStudent ID: " + studentID +"\nCourses Enrolled : " + courses + "\nBalance : " + tuitionBalance; 
    }
}
