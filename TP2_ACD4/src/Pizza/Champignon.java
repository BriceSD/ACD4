package Pizza;

public  class  Champignon  extends  IngrediantPizza 
{
	public  Champignon(Pizza  p) 
	{
		super(p );
	}
	
	public  double  calculePrix () 
	{
		return  1.2 + super.calculePrix ();
	}
	
	public  String  afficheDescription ()
	{
		return  super.afficheDescription () + " | Champignons | ";
	}
	
}