package decoratore;

import net.Imane.produits.Boisson;

public class Lait extends DecorateurBoisson{

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au lait";
    }

    @Override
    public double cout() {
        return 3+ boisson.cout();
    }
}
