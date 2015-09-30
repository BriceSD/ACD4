/*
 * Pizza.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package decorateurPizza;

public abstract class Pizza {
  protected String description;

  public String afficheDescription() {
    return description;
  }

  public abstract double calculePrix();
}
