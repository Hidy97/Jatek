package jatek;
public class Kezdes extends Helyszin{

    @Override
    public String leiras() {
        return "Kezdés! Fordulj valamelyik irányba: bal, jobb!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Balra();
    }

    @Override
    public String egyikBtnFelirata() {
        return "balra";
    }
    
}
