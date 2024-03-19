package model;
import model.Person;
public class Proffesor extends Person {

   private String course;
   private int year;

    public Proffesor() {
    }

    public Proffesor(String nume, String phoneNumber, String email, String course, int year) {
        super(nume, phoneNumber, email);
        this.course = course;
        this.year = year;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }


}
