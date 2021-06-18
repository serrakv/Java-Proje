package StudentDatabaseApp;

import java.util.Scanner;

public class studentdatabaseapp {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private static int id = 1000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        Student[] students = new Student[numOfStudent];

        for (int n = 0; n < numOfStudent; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }

        for (int n = 0; n < numOfStudent; n++) {

            System.out.println(students[n].toString());
        }
    }
}
