package Pizza;

public  class  OliveNoir  extends  IngrediantPizza 
{
	
	public  OliveNoir(Pizza  p) 
	{
		super(p);
	}
	
	public  double  calculePrix ()
	{
		return  .1 + super.calculePrix ();
	}
	
	public  String  afficheDescription ()
	{
		return  super.afficheDescription () + " | Olives  noires | ";
	}
	
}