public class Main {
    public static void main (String[] args) {

        Person David = new Person(true, "David");
        Person Mary = new Person(false, "Mary");

        Person Kevin = new Person(true, "Kevin");
        Person Barbie = new Person(false, "Barbie");

        System.out.println("David marry Mary - " + David.marry(Mary));
        System.out.println("David marry Mary - " + David.marry(Mary));

        System.out.println("Kevin marry Barbie - " + Kevin.marry(Barbie));
        System.out.println("Kevin divorce with Barbie - " + Kevin.divorce());
        System.out.println("Barbie divorce with Kevin - " + Barbie.divorce());
        System.out.println("Kevin marry Mary - " + Kevin.marry(Mary));

        System.out.println("Kevin marry David - " + Kevin.marry(David));
        System.out.println("Barbie marry Mary - " + Barbie.marry(Mary));

        System.out.println("David marry Barbie - " + Barbie.marry(David));
    }
}
