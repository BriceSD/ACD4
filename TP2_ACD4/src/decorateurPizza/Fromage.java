/*
 * Fromage.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package decorateurPizza;

public class Fromage
    extends DecorateurPizza {
  public Fromage(Pizza pizza) {
    super(pizza);
  }

  public double calculePrix() {
    return 1.50 + super.calculePrix();
  }

  public String afficheDescription() {
    return super.afficheDescription() + ", fromage ";
  }
}
