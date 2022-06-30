public class Task04 {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 20,  10, true);

        Student student2 = new Student(student1);

//        student2.name = student1.name;
//        student2.age = student1.age;
//        student2.mark = student1.mark;
//        student2.alive = student1.alive;

        Student student3 = new Student(student1);
        Student student4 = new Student(student1);


    }
}
