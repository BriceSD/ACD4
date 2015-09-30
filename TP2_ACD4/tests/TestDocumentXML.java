/*
 * TestDocumentXML.java
 * SAUNIER DEBES Brice
 * 30/09/15
 */


import documentXML.*;

public class TestDocumentXML {
  public static void main(String[] args) {
    //Création des éléments simples qui composent le premier livre
    ElementXML element1 = new ElementXMLSimple("titre");
    element1.setValeur("Guerre et Paix");
    ElementXML element2 = new ElementXMLSimple("auteur");
    element2.setValeur("Léon Tolstoi");
    ElementXML element3 = new ElementXMLSimple("nombrepages");
    element3.setValeur("1572");

    //Création de l’élément composé premier livre
    ElementXML livre1 = new ElementXMLCompose("livre");
    //Ajout des éléments simples dans le premier livre
    livre1.ajouteEnfant(element1);
    livre1.ajouteEnfant(element2);
    livre1.ajouteEnfant(element3);

    //Création des éléments simples du second livre
    ElementXML element4 = new ElementXMLSimple("titre");
    element4.setValeur("La Dame aux camelias");
    ElementXML element5 = new ElementXMLSimple("auteur");
    element5.setValeur("Alexandre Dumas");

    //Création des éléments simples qui composent publication
    ElementXML element6 = new ElementXMLSimple("editeur");
    element6.setValeur("Lebegue");
    ElementXML element7 = new ElementXMLSimple("dateparution");
    element7.setValeur("1848");

    //Création de l’élément composé publication
    ElementXML publication = new ElementXMLCompose("publication");
    //Ajout des éléments simples dans publication
    publication.ajouteEnfant(element6);
    publication.ajouteEnfant(element7);

    //Création de l’élément composé second livre
    ElementXML livre2 = new ElementXMLCompose("livre");
    //Ajout des éléments simples dans le second livre
    livre2.ajouteEnfant(element4);
    livre2.ajouteEnfant(element5);
    //Ajout de l’éléments composé dans le second livre
    livre2.ajouteEnfant(publication);

    ElementXML livres = new ElementXMLCompose("livres");
    //Ajout de chaque livre dans l’élément composé livres
    livres.ajouteEnfant(livre1);
    livres.ajouteEnfant(livre2);

    livres.afficher();


    Element livre1Adaptateur = new ElementAdapte((ElementXMLCompose) livre1);
    System.out.println("\n\nNombre d’enfants dans l’élément composé livre 1 : "
        + livre1Adaptateur.getNombreEnfants());
    ElementXML enfantAvecTagRenseigne =
        livre1Adaptateur.getPremierEnfantAvecTag("titre");
    System.out.println(
        "Valeur de l’enfant avec le tag renseigné : " + enfantAvecTagRenseigne
            .getValeur());

  }
}
