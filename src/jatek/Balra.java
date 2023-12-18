package jatek;

public class Balra extends Helyszin {

    @Override
    public String leiras() {
        return "Ez balra van!";
    }

    @Override
    public String egyikBtnFelirata() {
        return "???";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Balra();
    }
    
}
