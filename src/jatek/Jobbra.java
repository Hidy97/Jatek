package jatek;

public class Jobbra extends Helyszin{

    @Override
    public String leiras() {
        return "Ez jobbra van...";
    }

    @Override
    public String egyikBtnFelirata() {
        return "???";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Balra();
    }

    @Override
    public Helyszin masikIrany() {
        return new Jobbra();
    }

    @Override
    public String masikBtnFelirata() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
