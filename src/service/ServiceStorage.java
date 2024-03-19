package service;
import model.Proffesor;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceStorage {

   static private List<Proffesor> prefesori = new ArrayList<>();
   static private List<Student>  studenti = new ArrayList<>();

    public static void create() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Introdu tipul de persoana, student sau profesor:");
        String tip = scanner.nextLine();

        if ("profesor".equals(tip)) {

            System.out.println("nume:");
            String name = scanner.nextLine();

            for (Proffesor prof : prefesori) {
                if (prof.getNume().equals(name))
                {
                    System.out.println("Already existing");
                    return;
                }
            }
            for (Student stud : studenti) {
                if (stud.getNume().equals(name))
                {
                    System.out.println("Already existing");
                    return;
                }
            }

            System.out.println("numar de telefon:");
            String phoneNumber = scanner.nextLine();

            System.out.println("email:");
            String email = scanner.nextLine();

            System.out.println("course:");
            String course = scanner.nextLine();

            System.out.println("anul:");
            int year = scanner.nextInt();

            Proffesor professor = new Proffesor(name, phoneNumber, email, course, year);

            getPrefesori().add(professor);
        } else if ("student".equals(tip)) {

            System.out.println("nume:");
            String name = scanner.nextLine();

            for (Student stud : studenti) {
                if (stud.getNume().equals(name))
                {
                    System.out.println("Already existing");
                    return;
                }
            }

            for (Proffesor prof : prefesori) {
                if (prof.getNume().equals(name))
                {
                    System.out.println("Already existing");

                    return;
                }
            }

            System.out.println("nr de telefon:");
            String phoneNumber = scanner.nextLine();

            System.out.println("email:");
            String email = scanner.nextLine();

            System.out.println("nr studentului:");
            int studentNumber = scanner.nextInt();

            System.out.println("average mark:");
            float averageMark = scanner.nextFloat();

            System.out.println("clasa:");
            int clasa = scanner.nextInt();


            Student student = new Student(name, phoneNumber, email, studentNumber, averageMark, clasa);

            getStudenti().add(student);
        } else {
            System.out.println("e ori profesor ori student ! ");
        }
    }

   public static void read()
   {
       Scanner scanner = new Scanner(System.in);

       String nume = scanner.nextLine();
       for (Proffesor prof : prefesori) {
           if (prof.getNume().equals(nume))
           {
               System.out.println("name: " + prof.getNume());
               System.out.println("phone number: " + prof.getPhoneNumber());
               System.out.println("email: " + prof.getEmail());
               System.out.println("course: " + prof.getCourse());
               System.out.println("year: " + prof.getYear());
               return;
           }
       }

       for (Student stud : studenti) {
           if (stud.getNume().equals(nume))
           {
               System.out.println("name: " + stud.getNume());
               System.out.println("phone number: " + stud.getPhoneNumber());
               System.out.println("email: " + stud.getEmail());
               System.out.println("nr_student: " + stud.getStudentNumber());
               System.out.println("average_mark: " + stud.getAverageMark());
               System.out.println("clasa: " + stud.getClasa());

               return;
           }
       }

       System.out.println("Not existing");
       return;


   }



    public static void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numele persoanei pe care vrei sa o updatezi: ");
        String nume = scanner.nextLine();
        for (Proffesor prof : prefesori)
        {
            if (prof.getNume().equals(nume))
            {
                System.out.println("Ai selectat un profesor.");
                String updatare;
                while (true)
                {

                    System.out.println("Ce doresti sa updatezi? Pentru terminarea updatarii, scrie quit_updating");
                    System.out.println("Introdu una dintre urmatoarele: \n" +
                            "numele\n" +
                            "nr_telefon\n" +
                            "email\n" +
                            "course\n" +
                            "year\n" +
                            "quit_updating");
                    String input = scanner.nextLine();

                    switch (input)
                    {
                        case "numele":
                            System.out.println("Introdu noul nume pentru " + prof.getNume());
                            updatare = scanner.nextLine();
                            for (Proffesor prof2 : prefesori)
                            {
                                if (prof2.getNume().equals(updatare))
                                {
                                    System.out.println("Already existing");
                                    System.out.println("Updating failed!");
                                    return;
                                }
                            }
                            for (Student stud2 : studenti)
                            {
                                if (stud2.getNume().equals(updatare))
                                {
                                    System.out.println("Already existing");
                                    System.out.println("Updating failed!");
                                    return;
                                }
                            }
                            prof.setNume(updatare);
                            break;

                        case "nr_telefon":
                            System.out.println("Introdu noul numar de telefon pentru: " + prof.getNume() + " care sa inlocuiasca " + prof.getPhoneNumber());
                            updatare = scanner.nextLine();
                            prof.setPhoneNumber(updatare);
                            break;
                        case "email":
                            System.out.println("Introdu noul email pentru: " + prof.getNume() + " care sa inlocuiasca " + prof.getEmail());
                            updatare = scanner.nextLine();
                            prof.setEmail(updatare);
                            break;
                        case "course":
                            System.out.println("Introdu noul course pentru: " + prof.getNume() + " care sa inlocuiasca " + prof.getCourse());
                            updatare = scanner.nextLine();
                            prof.setCourse(updatare);
                            break;
                        case "year":
                            System.out.println("Introdu noul year pentru: " + prof.getNume() + " care sa inlocuiasca " + prof.getYear());
                            updatare = scanner.nextLine();
                            prof.setYear(Integer.parseInt(updatare));
                            break;
                        case "quit_updating":
                            System.out.println("Am oprit updating-ul pentru " + prof.getNume());
                            return;
                        default:
                            System.out.println("Introdu una dintre urmatoarele: \n" +
                                    "numele\n" +
                                    "nr_telefon\n" +
                                    "email\n" +
                                    "course\n" +
                                    "year\n" +
                                    "quit_updating");
                    }
                }
            }
        }
        for (Student stud : studenti)
        {
                if (stud.getNume().equals(nume))
                {
                    System.out.println("Ai selectat un student.");
                    String updatare;
                    while (true)
                    {

                        System.out.println("Ce doresti sa updatezi? (Pentru terminarea updatarii, scrie quit_updating) ");
                        System.out.println("Introdu una dintre urmatoarele: \n" +
                                "numele\n" +
                                "nr_telefon\n" +
                                "email\n" +
                                "nr_student\n" +
                                "average_mark\n" +
                                "class\n" +
                                "quit_updating");
                        String input = scanner.nextLine();

                        switch (input)
                        {
                            case "numele":
                                System.out.println("Introdu noul nume pentru " + stud.getNume());
                                updatare = scanner.nextLine();
                                for (Student stud2 : studenti)
                                {
                                    if (stud2.getNume().equals(updatare))
                                    {
                                        System.out.println("Already existing");
                                        System.out.println("Updating failed!");
                                        return;
                                    }
                                }
                                for (Proffesor prof2 : prefesori)
                                {
                                    if (prof2.getNume().equals(updatare))
                                    {
                                        System.out.println("Already existing");
                                        System.out.println("Updating failed!");
                                        return;
                                    }
                                }
                                stud.setNume(updatare);
                                break;

                            case "nr_telefon":
                                System.out.println("Introdu noul numar de telefon pentru: " + stud.getNume() + " care sa inlocuiasca " + stud.getPhoneNumber());
                                updatare = scanner.nextLine();
                                stud.setPhoneNumber(updatare);
                                break;
                            case "email":
                                System.out.println("Introdu noul email pentru: " + stud.getNume() + " care sa inlocuiasca " + stud.getEmail());
                                updatare = scanner.nextLine();
                                stud.setEmail(updatare);
                                break;
                            case "nr_student":
                                System.out.println("Introdu noul student_number pentru: " + stud.getNume() + " care sa inlocuiasca " + stud.getStudentNumber());
                                updatare = scanner.nextLine();
                                stud.setStudentNumber(Integer.parseInt(updatare));
                                break;
                            case "average_mark":
                                System.out.println("Introdu noul average_mark pentru: " + stud.getNume() + " care sa inlocuiasca " + stud.getAverageMark());
                                updatare = scanner.nextLine();
                                stud.setAverageMark(Float.parseFloat(updatare));
                                break;
                            case "class":
                                System.out.println("Introdu noul class pentru: " + stud.getNume() + " care sa inlocuiasca " + stud.getClasa());
                                updatare = scanner.nextLine();
                                stud.setClasa(Integer.parseInt(updatare));
                                break;
                            case "quit_updating":
                                System.out.println("Am oprit updating-ul pentru " + stud.getNume());
                                return;
                            default:
                                System.out.println("Introdu una dintre urmatoarele: \n" +
                                        "nume\n" +
                                        "nr_telefon\n" +
                                        "email\n" +
                                        "nr_student\n" +
                                        "average_mark\n" +
                                        "class\n" +
                                        "quit_updating");
                        }
                    }
                }



        }
        System.out.println("Not existing");
        return;
    }

    public static void delete()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numele persoanei pe care vrei sa o stergi: ");
        String nume = scanner.nextLine();

        for (Proffesor prof : prefesori) {
            if (prof.getNume().equals(nume))
            {
                System.out.println("Ai ales un profesor ! Acesta urmeaza sa fie sters");
                prefesori.remove(prof);
                System.out.println("Stergerea a fost efectuata cu succes");
                return;
            }
        }

        for (Student stud : studenti) {
            if (stud.getNume().equals(nume))
            {
                System.out.println("Ai ales un student ! Acesta urmeaza sa fie sters");
                studenti.remove(stud);
                System.out.println("Stergerea a fost efectuata cu succes");
                return;
            }
        }

        System.out.println("Not existing");
        return;

    }


    static public List<Proffesor> getPrefesori() {
        return prefesori;
    }

   static public List<Student> getStudenti() {
        return studenti;
    }
}
