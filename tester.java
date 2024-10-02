package Diagram;

import java.util.Scanner;

import TOKO.CD;
import TOKO.DVD;



public class tester {
    public static void main(String[] args) {
        int Salary = 7500;

        Scanner s = new Scanner(System.in);
        System.out.println("Choose One");
        System.out.println("1. Student/2. Teacher");
        int pilihan = s.nextInt();
        if (pilihan == 1) {
            System.out.println("Nama: ");
            String name = s.next();
            System.out.println("Major: ");
            String major = s.next();
            System.out.println("Age: ");
            int age = s.nextInt();
            System.out.println("Student Number: ");
            int studentNumber= s.nextInt();
            System.out.println("Score: ");
            int score= s.nextInt();
    
            Student st = new Student(studentNumber,name, age,  score, major);
            st.print();
    
                } else if (pilihan == 2) {
                    System.out.println("Choose One");
                    System.out.println("1. Full Time/n2. Part Time");
                    int pilihan2 = s.nextInt();
                    // Teacher tc = new Teacher();
                    // tc.print();

                    if (pilihan2 == 1) {
                        
                        System.out.println("Name: ");
                        String name = s.next();
                        System.out.println("Subject: ");
                        String subject = s.next();
                        System.out.println("Age: ");
                        int age = s.nextInt();
                        System.out.println("AnnualSalary: ");
                        int anualSalary= s.nextInt();
                        System.out.println("Unit: ");
                        String unit= s.next();
                        FullTime ft = new FullTime(name, age ,subject, anualSalary, unit);
                         ft.print();

                        
                    }else if(pilihan2 == 2) {
                        System.out.println("Name: ");
                        String name = s.next();
                        System.out.println("Subject: ");
                        String subject = s.next();
                        System.out.println("Age: ");
                        int age = s.nextInt();
                        System.out.println("HoursWorked: ");
                        int hoursWorked = s.nextInt();
                        PartTime pt = new PartTime(name, age, subject, hoursWorked, Salary);
                        pt.print();
                        System.out.println("Total Salary: "+ Salary*hoursWorked);

                    }
    
                } else {
                    
                }

        
        
        
        
        // Person pr = new Person();
        // pr.print();
        // Student st = new Student();
        // st.print();
        // Teacher tc = new Teacher();
        // tc.print();
        // FullTime ft = new FullTime();
        // ft.print();
        // PartTime pt = new PartTime();
        // pt.print();
    }
}
