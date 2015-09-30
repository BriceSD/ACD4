/*
 * PizzaPateFine.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package decorateurPizza;

public class PizzaPateFine
    extends Pizza {
  public PizzaPateFine() {
    description = "Pizza à pâte fine";
  }

  public double calculePrix() {
    return 3.99;
  }
}
