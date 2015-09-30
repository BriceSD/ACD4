/*
 * OliveNoire.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package decorateurPizza;

public class OliveNoire
    extends DecorateurPizza {
  public OliveNoire(Pizza pizza) {
    super(pizza);
  }

  public double calculePrix() {
    return 0.90 + super.calculePrix();
  }

  public String afficheDescription() {
    return super.afficheDescription() + ", olives  noires";
  }
}
