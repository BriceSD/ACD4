/*
 * Element.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */

package documentXML;

public interface Element {
  int getNombreEnfants();

  ElementXML getEnfant(int index);

  ElementXML getPremierEnfantAvecTag(String tag);
}
