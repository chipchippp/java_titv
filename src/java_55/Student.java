package java_55;


public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String tenLop;
    private double gpa;

    public Student(int id, String name, String tenLop, double gpa) {
        this.id = id;
        this.name = name;
        this.tenLop = tenLop;
        this.gpa = gpa;
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

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String getTen(){
        String s = this.name.trim();
        if (s.indexOf(" ")>0){
           int vtri = s.lastIndexOf(" ");
           return  s.substring(vtri+1);
        } else {
            return s;
        }
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name = " + name  +
                ", tenLop = " + tenLop  +
                ", gpa = " + gpa ;
    }

    @Override
    public int compareTo(Student o) {
        // <0
        // =0
        // >0
        // so sanh ten
        //Ten Adan, Obama, nguyen van a
        String tenThis = this.getTen();
        String tenO = o.getTen();

        return  tenThis.compareTo(tenO);
//        return this.id - o.id;
    }
}
