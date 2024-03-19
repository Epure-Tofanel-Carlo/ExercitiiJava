package model;
import java.util.Scanner;
import model.Person;
public class Student extends Person{

    private int studentNumber;
    private float averageMark;
    private int clasa;

    public Student() {
    }

    public Student(String nume, String phoneNumber, String email, int studentNumber, float averageMark, int clasa) {
        super(nume, phoneNumber, email);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.clasa = clasa;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public int getClasa() {
        return clasa;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }
}
