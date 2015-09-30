/*
 * ElementXMLCompose.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package documentXML;

import java.util.ArrayList;
import java.util.List;

public class ElementXMLCompose
    extends ElementXML {

// ------------------------------ FIELDS ------------------------------

  protected List<ElementXML> enfants = new ArrayList<ElementXML>();

// --------------------------- CONSTRUCTORS ---------------------------

  public ElementXMLCompose(String tag) {
    super(tag);
  }

// -------------------------- OTHER METHODS --------------------------

  public void ajouteEnfant(ElementXML enfant) {
    enfants.add(enfant);
  }

  public List<ElementXML> getElementsEnfants() {
    return enfants;
  }

  public String getValeur() {
    return null;
  }

  public void setValeur(String valeur) {
  }

  public void afficher() {
    System.out.println("<" + this.getTag() + ">");
    for (ElementXML enfant : enfants) {
      enfant.afficher();
    }
    System.out.println("</" + this.getTag() + ">");
  }
}
