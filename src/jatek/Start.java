package jatek;

public class Start extends Helyszin{

    @Override
    public String leiras() {
        return "Ez a start! Haladj tovább!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }

    @Override
    public String egyikBtnFelirata() {
        return "Tovább...";
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
