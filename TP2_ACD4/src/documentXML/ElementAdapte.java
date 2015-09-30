/*
 * ElementAdapte.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package documentXML;

import java.util.List;

public class ElementAdapte
    implements Element {
// ------------------------------ FIELDS ------------------------------

  protected ElementXMLCompose adapte;

// --------------------------- CONSTRUCTORS ---------------------------

  public ElementAdapte(ElementXMLCompose adapte) {
    this.adapte = adapte;
  }

// --------------------- Interface Element ---------------------

  public int getNombreEnfants() {
    return adapte.getElementsEnfants().size();
  }

  public ElementXML getEnfant(int index) {
    List<ElementXML> enfants = adapte.getElementsEnfants();
    return enfants.get(index);
  }

  public ElementXML getPremierEnfantAvecTag(String tag) {
    List<ElementXML> enfants = adapte.getElementsEnfants();
    for (ElementXML enfant : enfants) {
      if (enfant.getTag().equals(tag))
        return enfant;
    }
    return null;
  }
}
