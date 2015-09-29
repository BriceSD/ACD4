package XML;

public  interface  Element
{
	
	ElementXML  getEnfant(int  index);
	ElementXML  getCompar(String  tag);
	int  getNombreEnfants ();
	
}