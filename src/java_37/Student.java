package java_37;

public class Student {
    private int id;
    private String name;
    private Date date;
    private double gpa;
    private LopHoc lopHoc;

    public Student(int id, String name, Date date, double gpa, LopHoc lopHoc) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gpa = gpa;
        this.lopHoc = lopHoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                ", name = '" + name + '\'' +
                ", date = " + date +
                ", gpa = " + gpa +
                ", lopHoc = " + lopHoc;
    }
    public String tenKhoa(){
        return this.lopHoc.getKhoa();
    }
    public boolean checkGpa(){
        return this.gpa >= 4;
    }
    public boolean kiemTraCungNgaySinh(Student student){
        return this.date.equals(student.date);
    }
}
