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
        hasznal(nev, 1);
    }

    public void hasznal(String nev, int darab) {
        hasznal(nev, darab, false);
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
                    felszereles.remove(2);
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
            if (felszerelese.getNev().equals(felszereles.get(index).getNev()) && !(darab > 1)) {
                if (!(felszerelese.getNev().equals(felszereles.get(index).getNev()))) {
                    darab = 0;
                }
                System.out.print(felszerelese.nev + ": " + darab + ", ");
                index++;
                darab++;
            }
        }
        System.out.println("életerő: " + eletero + ", " + "ügyesség: " + ugyesseg + ", " + "szerencse: " + szerencse);
    }

    public void kiir2() {
        System.out.println("A tulajdonodban van: ");
        for (Targy felszerelese : felszereles) {
            if (felszerelese.getNev().equals(felszerelese.nev)) {
                System.out.print(felszerelese.nev + ", ");
            }
        }
        System.out.println("életerő: " + eletero + ", " + "ügyesség: " + ugyesseg + ", " + "szerencse: " + szerencse);
    }

    @Override
    public String toString() {
        return "Karakter{" + "felszereles=" + felszereles + ", eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + '}';
    }

}
