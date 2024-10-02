package Diagram;

public class FullTime extends Teacher {
    private int anualSalary;
    private String unit;



    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public FullTime() {
        super();
        anualSalary = 0;
        unit = "";
    }

    public FullTime(String nama, int umur, String subject, int anualSalary,String unit){
        super(nama, umur,subject);
        this.anualSalary = anualSalary;
        this.unit = unit;

    }
    


    public void print() {
        super.print();
        System.out.println("Salary: "+anualSalary);
        System.out.println("Unit: "+unit);
    }

}
