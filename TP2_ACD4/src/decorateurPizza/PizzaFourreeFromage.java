/*
 * PizzaFoureeFromage.java
 * SAUNIER DEBES Brice
 * 29/09/15
 */

package decorateurPizza;

public class PizzaFourreeFromage
    extends Pizza {
  public PizzaFourreeFromage() {
    description = "Pizza à pâte  fourrée au  fromage";
  }

  public double calculePrix() {
    return 5.99;
  }
}
