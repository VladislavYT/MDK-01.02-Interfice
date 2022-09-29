public class Magazine implements Printable {
    String name;

    @Override
    public void print() {
        System.out.print("Журнал: ");
    }
    public void printMagazines(Printable[] printable) {
        System.out.print(name);
    }
}