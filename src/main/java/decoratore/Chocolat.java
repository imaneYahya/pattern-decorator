package decoratore;

import net.Imane.produits.Boisson;

public class Chocolat extends DecorateurBoisson{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au chocolat";
    }

    @Override
    public double cout() {
        return 5+ boisson.cout();
    }
}
