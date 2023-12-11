package jatek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jatek {
    static Karakter elf = new Karakter();

    public static void main(String[] args) throws IOException {
        Jatek.feladatok();
        jatekMent();
        
    }

    private static void jatekMent() throws FileNotFoundException, IOException {
        try(ObjectOutputStream objKi= new ObjectOutputStream(new FileOutputStream("karakterek.bin"))){
            objKi.writeObject(elf);
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void feladatok() {
        
        Targy fegyver1 = new Targy("Kard", "Egy ősiromok között talált rozsdás sz...");
        Targy fegyver2 = new Targy("Kard", "A fény templomának ceremoniális kardja (meglepően éles...).");
        Targy fizetoEszkoz1 = new Targy("Aranyérme", "Drááágasáááág");
        Targy fizetoEszkoz2 = new Targy("Kristály", "Kék fényű ragyogó kristály, a kereskedők különösen szeretik");
        
        elf.felvesz(fegyver2);
        elf.felvesz(fegyver1);
        elf.felvesz(fizetoEszkoz1);
        elf.felvesz(fizetoEszkoz1);
        elf.felvesz(fizetoEszkoz1);
        elf.felvesz(fizetoEszkoz1);
        elf.felvesz(fizetoEszkoz2);
        elf.felvesz(fizetoEszkoz2);
        
        //System.out.println(elf.toString());
        //elf.kiir();
        elf.kiir2();
        elf.hasznal("kard");
        elf.kiir2();
        elf.hasznal("aranyérme", 2, true);
        elf.kiir2();
    }
    
}
