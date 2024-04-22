package java_73;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    private ArrayList<Student> students;

    public StudentList() {
        this.students = new ArrayList<Student>();
    }

    public StudentList(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student st){
        this.students.add(st);
    }
    public void inStudentList(){
        for (Student student: students) {
            System.out.println(student);
        }
    }
    public boolean checkListRong(){
        return this.students.isEmpty();
    }

    public int layQuantityStudent(){
        return this.students.size();
    }

    public void lamRongDanhSach(){
        this.students.removeAll(students);
    }
    public boolean checkStudentCoTonTai(Student st){
        return this.students.contains(st);
    }
    public boolean removeStudent(Student st){
        return this.students.remove(st);
    }
    public void searchStudent(String ten){
        for (Student student: students) {
            if (student.getName().indexOf(ten)>=0){
                System.out.println(student);
            } else {
                System.out.println(" hi");
            }
        }
    }
    public void sortStudentGiamDanGpa(){
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if (st1.getGpa()>st2.getGpa()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    //10. Ghi xuong file
    public void  ghiDataXuongFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for (Student st : students) {
                oos.writeObject(st);
            }
            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
