public class Main {
    public static void main(String[] args) {
        Singer singer = new Singer("Akti","singing","Kg");
        Dancer dancer = new Dancer("Ali","dancing","Kz");
        Programmer programmer = new Programmer("Aksa","coding","Peaksoft");
        System.out.println(singer);
        singer.singing();
        singer.learn();
        singer.walk();
        singer.eat();
        System.out.println();
        System.out.println(dancer);
        dancer.dancing();
        dancer.walk();
        dancer.learn();
        dancer.eat();
        System.out.println();
        System.out.println(programmer);
        programmer.walk();
        programmer.eat();
        programmer.learn();
        programmer.coding();




    }
}