/*
 * Jambon.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package decorateurPizza;

public class Jambon
    extends DecorateurPizza {

  public Jambon(Pizza pizza) {
    super(pizza);
  }

  public double calculePrix() {
    return 2 + super.calculePrix();
  }

  public String afficheDescription() {
    return super.afficheDescription() + ", jambon";
  }
}
