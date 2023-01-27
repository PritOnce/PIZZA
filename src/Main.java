public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("mitjana","margarita");
        Pizza p2 = new Pizza("familiar", "quatre_formatges");
        p2.sirve();
        Pizza p3 = new Pizza("mitjana","funghi");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("demanades: " +Pizza.getTotalDemanades());
        System.out.println("servides: " +Pizza.getTotalServides());

    }
}