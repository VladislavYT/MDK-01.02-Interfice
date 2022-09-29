public class Book implements Printable {
    static String name;

    @Override
    public void print() {
        System.out.print("Книга: ");
    }

    public static void printBooks(Printable[] printable) {
        System.out.println(name);
    }
}