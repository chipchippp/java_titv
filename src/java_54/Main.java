package java_54;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(100, "Nguyen long A", "t2210a", 9);
        Student student2 = new Student(150, "Nguyen van B", "t2210a1", 8);
        Student student3 = new Student(150, "Nguyen Thi M", "t2210a1", 8);

        System.out.println(student.compareTo(student2));
        System.out.println(student3.compareTo(student));

    }
}
