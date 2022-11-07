package company.vesminetelesa;

public class Galaxia extends Slnecna_sustava{
    private String name;
    private Slnecna_sustava[] planetarne_sustavy = new Slnecna_sustava[1000];
    private int pocet_sustav;

    public void addSustava(Slnecna_sustava tato_sustava){
        planetarne_sustavy[pocet_sustav] = new Slnecna_sustava();
    }

    public Galaxia() {
        pocet_sustav = 0;
    }
}
