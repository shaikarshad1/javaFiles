package comparableComparator;

public class Student { //implements Comparable<Student>{

    public int id;
    public String name;
    public int marks;

    public Student(int id, String name,int marks) {
        this.id = id;
        this.name = name;
        this.marks=marks;
    }

//    @Override
//    public int compareTo(Student o) {
//        if(this.id>o.id){
//            return 1;
//        }
//        return -1;
//    }
}
