/*
 * ElementXMLSimple.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package documentXML;

public class ElementXMLSimple
    extends ElementXML {

// ------------------------------ FIELDS ------------------------------

  protected String valeur;

// --------------------------- CONSTRUCTORS ---------------------------

  public ElementXMLSimple(String tag) {
    super(tag);
  }

// -------------------------- OTHER METHODS --------------------------

  public void ajouteEnfant(ElementXML enfant) {
  }

  public String getValeur() {
    return valeur;
  }

  public void setValeur(String valeur) {
    this.valeur = valeur;
  }
}
