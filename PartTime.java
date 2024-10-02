package Diagram;

public class PartTime extends Teacher {
    private int hoursWorked;
    private int salary;

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public PartTime() {
        super();
        hoursWorked = 0;
        salary = 0;
    }

    public PartTime(String nama, int umur, String subject, int hoursWorked, int salary){
        super(nama, umur, subject);
        this.hoursWorked = hoursWorked;
        this.salary = salary;
    }

    
    public void print() {
        super.print();
        System.out.println("HoursWorked: "+hoursWorked);
        System.out.println("Salary: "+salary);
    }

}
