package StudentPackage;

public class Acadinfo {

    int studentNumber;
    double quiz1, quiz2, midterm, finalExam, average;
    int attendance;


    public Acadinfo(int studentNumber, double quiz1, double quiz2,
                    double midterm, double finalExam, int attendance) {

        this.studentNumber = studentNumber;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.midterm = midterm;
        this.finalExam = finalExam;
        this.attendance = attendance;

        average = (quiz1 + quiz2 + midterm + finalExam) / 4;
    }

    public void displayEducDetails() {
        System.out.println("\nSTUDENT EDUCATIONAL DETAILS");
        System.out.println("Student Number: " + studentNumber);
        System.out.printf("Student Grade Average: %.2f%n", average);
        System.out.println("Student Attendance: " + attendance + "%");
