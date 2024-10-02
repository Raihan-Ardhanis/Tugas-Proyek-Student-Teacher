package Diagram;

public class Student extends Person{
    private int studentNumber;
    private int score;
    private String major;

    public Student() {
        studentNumber = 0;
        score = 0;
        major = "";
    }
    public Student(int studentNumber, String nama, int umur, int score, String major){
        super(nama,umur);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }


    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void print() {
        super.print();
        System.out.println("Student Number: "+studentNumber);
        System.out.println("Score: "+score);
        System.out.println("Major: "+major);
    }

}