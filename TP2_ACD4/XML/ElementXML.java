package XML;

public  abstract  class  ElementXML 
{
	protected  String  tag;
	
	public  abstract  void  setValeur(String  valeur );
	public  abstract  String  getValeur ();
	public  abstract  void  ajouteEnfant(ElementXML  enfant );
	
	public  ElementXML(String  tag) 
	{
		this.tag = tag;
	}
	
	public  String  getTag ()
	{
		return  tag;
	}
	
}