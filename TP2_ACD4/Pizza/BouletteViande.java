package Pizza;


public  class  BouletteViande  extends  IngrediantPizza 
{
	
	public  BouletteViande(Pizza  p) 
	{
		super(p );
	}
	
	public  double  calculePrix () 
	{
		return  5. + super.calculePrix ();
	}
	
	public  String  afficheDescription ()
	{
		return  super.afficheDescription ()+ " | Boulettes  de  viande | ";
	}
	
}
