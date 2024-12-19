package decoratore;

import net.Imane.produits.Boisson;

public abstract class DecorateurBoisson extends Boisson{
    protected Boisson boisson;

    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }
}
