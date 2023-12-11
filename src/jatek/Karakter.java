package jatek;

import java.util.ArrayList;

/**
 *
 * @author csaladi.alexandra
 */
public class Karakter {
    
    ArrayList<Targy> felszereles;
    //String [] felszereles;
    int eletero, ugyesseg, szerencse;

//    public Karakter(String[] felszereles, int eletero, int ugyesseg, int szerencse) {
//        this.felszereles = felszereles;
//        this.eletero = eletero;
//        this.ugyesseg = ugyesseg;
//        this.szerencse = szerencse;
//    }

    public Karakter(ArrayList<Targy> felszereles, int eletero, int ugyesseg, int szerencse) {
        this.felszereles = felszereles;
        this.eletero = dobas()+dobas()+12;
        this.ugyesseg = dobas()+6;
        this.szerencse = dobas()+6;
    }
    
    private int dobas(){
        int kocka = (int)Math.random()*(6-1)+1;
        return kocka;
    }   
    
    public Targy felvesz(Targy targy){
        felszereles.add(targy);
        return targy;
    }

    @Override
    public String toString() {
        return "Karakter{" + "felszereles=" + felszereles + ", eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + '}';
    }
        
}
