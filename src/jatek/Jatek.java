package jatek;

public class Jatek {

    public static void main(String[] args) {
        Karakter elf = new Karakter();
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
