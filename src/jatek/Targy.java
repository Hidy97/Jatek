package jatek;

import java.util.UUID;

/**
 *
 * @author csaladi.alexandra
 */
public class Targy {
    String nev, leiras;
    UUID id;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        id = UUID.randomUUID();
    }  

    public UUID getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

    @Override
    public String toString() {
        return "Targy{" + "nev=" + nev + ", leiras=" + leiras + ", id=" + id + '}';
    }
    
}
