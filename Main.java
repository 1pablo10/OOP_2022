package company;

import company.space.hmlovina;
import company.space.vesmir;
import company.vesminetelesa.*;

import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        vesmir mojprvyvesmir = new vesmir();
        mojprvyvesmir.startVesmir();
        hmlovina MiroSmajda = new hmlovina();
        hmlovina PetoCmorik = new hmlovina();
        hmlovina KatkaKnechtova = new hmlovina();
        Planeta X = new Planeta("X",5972200,12756);
        X.setPlanetaryWeight(-2000000);
        Hviezda Slnko = new Hviezda("Slnko",696340,4603);
        Slnecna_sustava Solar = new Slnecna_sustava();
        Solar.addTeleso(X);

        Galaxia Mliecna_Cesta = new Galaxia();
        Mliecna_Cesta.addSustava(Solar);
        Vesmirne_telesa Cierna_diera = new Vesmirne_telesa();

        Mliecna_Cesta.addTeleso(Cierna_diera);
        System.out.printf("Typ telesa: %s",Cierna_diera.getType());

        Galaxia Hudak = new Galaxia();

    }
}