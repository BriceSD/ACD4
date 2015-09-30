/*
 * BouletteViande.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package decorateurPizza;

public class BouletteViande
    extends DecorateurPizza {
  public BouletteViande(Pizza pizza) {
    super(pizza);
  }

  public double calculePrix() {
    return 5.50 + super.calculePrix();
  }

  public String afficheDescription() {
    return super.afficheDescription() + ", Boulettes  de  viande";
  }
}
