package jatek;
public class Kezdes extends Helyszin implements MasikIrany{

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

    @Override
    public Helyszin masikIrany() {
        return new Jobbra();
    }

    @Override
    public String masikBtnFelirata() {
        return "jobra";
    }
    
}
