package Diagram;

public class Person {
    private String nama;
    private int umur;

    public Person() {
        nama = "";
        umur = 0;
    }

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void print() {
        System.out.println("Name: " +nama);
        System.out.println("Age: " +umur);
    }

    
    

}
