/*
 * Thon.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package decorateurPizza;

public class Thon
    extends DecorateurPizza {
  public Thon(Pizza pizza) {
    super(pizza);
  }

  public double calculePrix() {
    return 2.80 + super.calculePrix();
  }

  public String afficheDescription() {
    return super.afficheDescription() + ", thon";
  }
}
