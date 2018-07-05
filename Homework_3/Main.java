public class Main {
    public static void main(String args []) {
        Person p = new Person("Oleg",1989);
        p.output();
        System.out.println("----------------------------");

        Person p1 = new Person();
        p1.setName("Rik");
        p1.setBirthYear(2001);
        p1.output();
        System.out.println("----------------------------");

        Person p2 = new Person("Robert", 1978);
        p2.output();
        p2.age();
        System.out.println("----------------------------");

        Person p3 = new Person("Oliver",1995);
        p3.output();
        p3.changeName("Mark");
        p3.age();
        System.out.println("----------------------------");

        Person p4 = new Person();
        p4.input("Lia",2008);
        p4.output();
    }
}
