package XML;

public  class  ElementXMLSimple  extends  ElementXML
{
	protected  String  valeur;
	
	public  ElementXMLSimple(String  tag) 
	{
		super(tag);
	}
	
	public  void  setValeur(String  valeur) 
	{
		this.valeur = valeur;
	}
	
	public  String  getValeur () 
	{
		return  valeur;
	}
	
	public  void  ajouteEnfant(ElementXML  enfant) {};
}