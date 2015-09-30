/*
 * Oignon.java
 * SAUNIER DEBES Brice
 * 29/09/15
 */

package decorateurPizza;

public class Oignon
    extends DecorateurPizza {
  public Oignon(Pizza pizza) {
    super(pizza);
  }

  public double calculePrix() {
    return 0.70 + super.calculePrix();
  }

  public String afficheDescription() {
    return super.afficheDescription() + ", oignons";
  }
}
