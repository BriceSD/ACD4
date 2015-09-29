package Pizza;

public  class  Jambon  extends  IngrediantPizza 
{
	
	public  Jambon(Pizza  p)
	{
		super(p);
	}
	
	public  double  calculePrix ()
	{
		return  3. + super.calculePrix ();
	}
	
	public  String  afficheDescription ()
	{
		return  super.afficheDescription () + " | Jambon | ";
	}
	
}