public class Task02 {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.name = "Alex";
        st1.age = 20;

        System.out.println(st1.getInfo());


        Student st2 = new Student();
        st2.name = "Anna";
        st2.age = 18;

        System.out.println(st2.getInfo());


        Student st3 = new Student();
        st3.name = "Peter";
        st3.age = 21;

        System.out.println(st3.getInfo());

    }
}
