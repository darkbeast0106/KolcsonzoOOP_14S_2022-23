package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static List<Kolcsonozheto> katalogus = new ArrayList<>();
    private static List<Dvd> dvdk = new ArrayList<>();

    public static void main(String[] args) {
        Konyv konyv1 = new Konyv("The Fellowship of the Ring", "J. R. R. Tolkien", "IS-1234");
        Konyv konyv2 = new Konyv("A Song of Ice and Fire", "George R. R. Martin", "IS-1234");
        Konyv konyv3 = new Konyv("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "IS-1234");
        Dvd dvd1 = new Dvd("The Lord of the Rings: The Fellowship of the Ring", 178);
        Dvd dvd2 = new Dvd("The Lord of the Rings: The Return of the King", 201);
        Dvd dvd3 = new Dvd("The Lord of the Rings: The Two Towers", 179);
        Dvd dvd4 = new Dvd("Star Wars: Episode IV - A New Hope", 121);
        Dvd dvd5 = new Dvd("Star Wars: Episode V - The Empire Strikes Back", 124);
        Dvd dvd6 = new Dvd("Star Wars: Episode VI - Return of the Jedi", 131);
        Ujsag ujsag1 = new Ujsag("Képes Sport", 2007, 23);
        Ujsag ujsag2 = new Ujsag("Képes Sport", 2007, 24);
        Ujsag ujsag3 = new Ujsag("Képes Sport", 2007, 25);
        Ujsag ujsag4 = new Ujsag("Képes Sport", 2007, 26);
        katalogus.add(konyv1);
        katalogus.add(konyv2);
        katalogus.add(konyv3);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(dvd4);
        katalogus.add(dvd5);
        katalogus.add(dvd6);
        katalogus.add(ujsag1);
        katalogus.add(ujsag2);
        katalogus.add(ujsag3);
        katalogus.add(ujsag4);

        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        dvdk.add(dvd4);
        dvdk.add(dvd5);
        dvdk.add(dvd6);

        System.out.println();
        for (Kolcsonozheto k : katalogus) {
            System.out.println(k.megjelenitendoNev());
            if (k instanceof Konyv) {
                System.out.println("\t"+((Konyv) k).getIsbn());
            }
        }

        System.out.println();
        Collections.sort(dvdk);
        for (Dvd dvd: dvdk) {
            System.out.println(dvd.megjelenitendoNev());
        }
    }
}
