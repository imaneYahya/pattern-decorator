import decoratore.Chocolat;
import decoratore.Lait;
import decoratore.Noisette;
import net.Imane.produits.Boisson;
import net.Imane.produits.Deca;
import net.Imane.produits.Espresso;
import net.Imane.produits.Sumatra;

public class Main {
    public static void main(String[] args) {

      Boisson boisson;
      boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("-------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());



        System.out.println("-------------");
        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("-------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("-----last test ----");
        Boisson b = new Chocolat(new Chocolat(new Chocolat(new Sumatra())));
        System.out.println(b.getDescription());
        System.out.println(b.cout());

    }
}