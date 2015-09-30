/*
 * DecorateurPizza.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package decorateurPizza;

public class DecorateurPizza
    extends Pizza {
  protected Pizza pizza;

  public DecorateurPizza(Pizza pizza) {
    this.pizza = pizza;
  }

  public double calculePrix() {
    return pizza.calculePrix();
  }

  public String afficheDescription() {
    return pizza.afficheDescription();
  }
}
