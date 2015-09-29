package XML;

public  class  TestXML 
{
	public  static  void  main(String [] args)
	{

			ElementXML  element1 = new  ElementXMLSimple (" Titre ");
			ElementXML  element2 = new  ElementXMLSimple (" Auteur ");
			ElementXML  element3 = new  ElementXMLSimple (" nbpages ");
			
			ElementXML  livre = new  ElementXMLCompose ("livre ");
			
			
			element1. setValeur (" Guerre et Paix ");
			element2. setValeur ("Leon");
			element3. setValeur ("1572");
			
			livre. ajouteEnfant(element1);
			livre. ajouteEnfant(element2);
			livre. ajouteEnfant(element3);
			
			
			//Adapteur
			Element  livreAdap = new  ElementAdapter((ElementXMLCompose) livre);
			
			int nbElement = livreAdap.getNombreEnfants ();
			
			System.out.println(nbElement);
			ElementXML  test = livreAdap.getCompar(" Auteur ");
			
			
			System.out.println(test.getValeur ());
	}
		
}
