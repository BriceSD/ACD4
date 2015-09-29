package Pizza;

public  class  Oignon  extends  IngrediantPizza 
{
	
	public  Oignon(Pizza  p)
	{
		super(p);
	}
	
	public  double  calculePrix () 
	{
		return  1.2 + super.calculePrix ();
	}
	
	
	public  String  afficheDescription ()
	{
		return  super.afficheDescription () + " | Oignons | ";
	}
	
}