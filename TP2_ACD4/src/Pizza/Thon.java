package Pizza;

public  class  Thon  extends  IngrediantPizza 
{
	
	public  Thon(Pizza  p)
	{
		super(p );
	}
	
	public  double  calculePrix ()
	{
		return  3 + super.calculePrix ();
	}
	
	public  String  afficheDescription () 
	{
		return  super.afficheDescription () + " | Thon | ";
	}
	
}