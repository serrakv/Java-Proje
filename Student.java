package StudentDatabaseApp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String studentID;
    private int gradeYear;
    private String courses = "";
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);

        this.firstName = in.nextLine();
        this.lastName = in.nextLine();
        this.gradeYear = in.nextInt();
    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
            tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {break;}
         }while (1!=0);
    }

    public void viewBalance() {

    }

    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
    }

    public String toString() {
        return "Öğrenci adı: " + firstName + " " + lastName +
                "\nSınıf Düzeyi: " + gradeYear +
                "\nStudentID: " + studentID +
                "\nBakiye: " + tuitionBalance;
    }
}



