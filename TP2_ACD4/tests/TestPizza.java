/*
 * TestPizzj.java
 * SAUNIER DEBES Brice
 * 29/09/15
 */

import decorateurPizza.*;


public class TestPizza {
  public static void main(String[] args) {

    //Création d’une pizza
    Pizza pizza1 = new PizzaPateFine();
    //La pizza est décoré par les différents ingrédients
    pizza1 = new Jambon(pizza1);
    pizza1 = new Fromage(pizza1);
    pizza1 = new Oignon(pizza1);
    pizza1 = new BouletteViande(pizza1);

    System.out.println("\n\nPizza1 : " + pizza1.
        afficheDescription() + "\nTarif: " + pizza1.calculePrix());


    //Création d’une pizza
    Pizza pizza2 = new PizzaFourreeFromage();
    //La pizza est décoré par les différents ingrédients
    pizza2 = new Oignon(pizza2);
    pizza2 = new Jambon(pizza2);
    pizza2 = new Fromage(pizza2);
    pizza2 = new OliveNoire(pizza2);
    pizza2 = new Thon(pizza2);

    System.out.println("\n\nPizza2 : " + pizza2.
        afficheDescription() + "\nTarif: " + pizza2.calculePrix());
  }
}
