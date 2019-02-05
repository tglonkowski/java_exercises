package J29;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

    private ArrayList<Student> studentList = new ArrayList<>(); //lista studentow klasy Student
    Scanner sc = new Scanner(System.in);

    public StudentController() {

        while (true) {

            System.out.println("D - dodaj, P - pokaż, U - usuń, M - modyfikuj, L - liczba studentów, K - koniec");
            String dec = sc.nextLine().toUpperCase();

            if (dec.equals("D")) {

                addStudent();
            }
            else if(dec.equals("P"))
                showStudent();
            else if(dec.equals("U")) {
                deleteStudent();
            }
            else if(dec.equals("M")) {
                modifyStudent();
            }
            else if(dec.equals("L"))
                countStudent();
        }
    }


    public void addStudent(){
        System.out.println("Podaj imię:");
        String imie = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        String nazwisko = sc.nextLine();
        System.out.println("Podaj indeks:");
        int indeks = sc.nextInt();
        sc.nextLine();

        Student student = new Student(imie, nazwisko, indeks);
        studentList.add(student);
        Student.count++;


        }

     public void showStudent() {

         for (Student x : studentList) {

             System.out.println(x);
         }
     }

      public void deleteStudent(){

             System.out.println();
             System.out.println("Podaj indeks studenta: ");
             int id = sc.nextInt();

             for (Student student : studentList){

                     if (student.getIndex() == id){

                         studentList.remove(student);
                         Student.count--;
                         break;
                     }
                 }
             }

      public void modifyStudent() {

          System.out.println();
          System.out.println("Podaj indeks studenta: ");
          int id = sc.nextInt();
          sc.nextLine();

          System.out.println("Podaj imię studenta: ");
          String imie = sc.nextLine();

          System.out.println("Podaj nazwisko studenta: ");
          String nazwisko = sc.nextLine();

              for (Student student : studentList) {

                  if (student.getIndex() == id){

                      student.setImie(imie);
                      student.setNazwisko(nazwisko);
                      break;
                  }

              }

          }

       public void countStudent(){

           System.out.println("Liczba studentów: " + Student.count);
       }

      }



