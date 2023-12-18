package jatek;

public class Jobbra extends Helyszin{

    @Override
    public String leiras() {
        return "Ez jobbra van...";
    }

    @Override
    public String egyikBtnFelirata() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String masikBtnFelirata() {
        return "jobbra";
    }


    public Helyszin masikIrany() {
        return new Jobbra();
    }
    
}
