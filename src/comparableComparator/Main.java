package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        Student s1=new Student(2,"b",10);
        Student s3=new Student(1,"a",10);

        Student s2=new Student(3,"c",10);
        students.add(s1);
        students.add(s3);
        students.add(s2);

        Collections.sort(students,(o1,o2)->o1.name.compareTo(o2.name));
        for(Student student:students)
            System.out.println(student.name);
    }
}
