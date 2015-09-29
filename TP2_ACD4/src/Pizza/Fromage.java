package Pizza;

public  class  Fromage  extends  IngrediantPizza 
{
	
	public  Fromage(Pizza  p) 
	{
		super(p );
	}
	
	public  double  calculePrix () 
	{
		return  2 + super.calculePrix ();
	}
	
	public  String  afficheDescription ()
	{
		return  super.afficheDescription () + " | Fromage | ";
	}
	
}