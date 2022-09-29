public class Main {
    public static void main(String[] args) {

        Book b = new Book();
        b.name = "Eric";
        Magazine m = new Magazine();
        m.name = "PC Gamer";

        Printable[] p = {b, m};

        for(int i = 0; i<p.length; i++){
            p[i].print();
            if(p[i] instanceof Book){
                Book.printBooks(p);
            }
            if(p[i] instanceof Magazine){
                ((Magazine) p[i]).printMagazines(p);
            }
        }
    }
}