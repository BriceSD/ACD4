/*
 * PizzaClassique.java
 * SAUNIER DEBES Brice
 * 29/09/15
 */

package decorateurPizza;

public class PizzaClassique
    extends Pizza {
  public PizzaClassique() {
    description = "Pizza classique ";
  }

  public double calculePrix() {
    return 2.99;
  }
}
