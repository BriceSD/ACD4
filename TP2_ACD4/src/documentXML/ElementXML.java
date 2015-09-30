/*
 * ElementXML.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package documentXML;

public abstract class ElementXML {

// ------------------------------ FIELDS ------------------------------

  protected String tag;

// --------------------------- CONSTRUCTORS ---------------------------

  public ElementXML(String tag) {
    this.tag = tag;
  }

// -------------------------- OTHER METHODS --------------------------

  public abstract void ajouteEnfant(ElementXML enfant);

  public String getTag() {
    return tag;
  }

  public abstract String getValeur();

  public abstract void setValeur(String valeur);

  public abstract void afficher();
}
