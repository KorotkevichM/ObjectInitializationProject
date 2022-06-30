public class Task03 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 9.5, true);
        System.out.println(student.getInfo());
//        student.name = "Alex";
//        student.age = 20;
//        student.mark = 9.5;
//        student.alive = true;

        Student student2 = new Student("Anna", 18, 8, true);
        System.out.println(student2.getInfo());


        Student student3 = new Student("Peter", 16, 10, true);
        System.out.println(student3.getInfo());


    }
}
