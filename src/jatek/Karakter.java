package jatek;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author csaladi.alexandra
 */
public class Karakter {

    private ArrayList<Targy> felszereles;
    //String [] felszereles;
    private int eletero, ugyesseg, szerencse;
    private Random rnd = new Random();

    public Karakter() {
        this.felszereles = new ArrayList<>();
        this.eletero = dobas() + dobas() + 12;
        this.ugyesseg = dobas() + 6;
        this.szerencse = dobas() + 6;
    }

    public ArrayList<Targy> getFelszereles() {
        return felszereles;
    }

    public int getEletero() {
        return eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }

    private int dobas() {
        return rnd.nextInt(6 + 1);
    }

    public Targy felvesz(Targy targy) {
        felszereles.add(targy);
        return targy;
    }

    public void hasznal(String nev) {
        hasznal(nev, eletero);
    }

    public void hasznal(String nev, int darab) {
        hasznal(nev, darab, true);
    }

    public void hasznal(String nev, int darab, boolean hasznalhato) {
        int db = 0;
        for (Targy felszerelese : felszereles) {
            if (felszerelese.nev.equals(nev)) {
                db++;
                if (db < darab) {
                    System.out.println("Nincs elég ebből a tárgyból!");
                    hasznalhato = false;
                } else {
                    felszereles.remove(felszerelese);
                    hasznalhato = true;
                }
            }
        }
    }

    public void kiir() {
        System.out.println("A tulajdonodban van: ");
        int index = 0;
        int darab = 0;
        for (Targy felszerelese : felszereles) {
            if (felszerelese.getNev().equals(felszereles.get(index).getNev()) ) {
                darab++;
                if (!(felszerelese.getNev().equals(felszereles.get(index).getNev())) && darab < 2) {
                    System.out.print(felszerelese.nev + ": " + darab + ", ");

                }
                index++;
            }
        }
        System.out.println("életerő: " + eletero + ", " + "ügyesség: " + ugyesseg + ", " + "szerencse: " + szerencse);
    }

    @Override
    public String toString() {
        return "Karakter{" + "felszereles=" + felszereles + ", eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + '}';
    }

}
