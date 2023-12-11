package jatek;

import java.util.ArrayList;

/**
 *
 * @author csaladi.alexandra
 */
public class Karakter {
    
    //ArrayList<String> felszereles;
    String [] felszereles;
    int eletero, ugyesseg, szerencse;

    public Karakter(String[] felszereles, int eletero, int ugyesseg, int szerencse) {
        this.felszereles = felszereles;
        this.eletero = eletero;
        this.ugyesseg = ugyesseg;
        this.szerencse = szerencse;
    } 
    
}
