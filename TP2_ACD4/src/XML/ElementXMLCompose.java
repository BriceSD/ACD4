package XML;

import  java.util .*;

public  class  ElementXMLCompose  extends  ElementXML 
{
	protected  List <ElementXML > enfants = new  ArrayList <ElementXML >();
	
	public  ElementXMLCompose(String  tag) 
	{
		super(tag);
	}
	
	public  void  setValeur(String  v){}
	
	public  String  getValeur ()
	{
		return  null;
	}
	
	public  void  ajouteEnfant(ElementXML  enfant) 
	{
		enfants.add(enfant );
	}
	
	public  List <ElementXML > getElementsEnfants () 
	{
		/*Pas ICI
		 * for(ElementXML elem: enfants)
	       {
	       	 System.out.println (elem);
	       }
	    */   
		return  enfants;
	}
}