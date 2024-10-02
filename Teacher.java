package Diagram;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
        super();
        subject = "";
    }
    public Teacher(String nama, int umur, String subject){
        super(nama,umur);
        this.subject = subject;
    }


    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void print() {
        super.print();
        System.out.println("Subject: "+subject);
    }

}
