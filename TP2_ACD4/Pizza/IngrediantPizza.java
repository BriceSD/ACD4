package Pizza;

public  abstract  class  IngrediantPizza  extends  Pizza 
{
	private  Pizza  pizza;
	
	public  IngrediantPizza(Pizza  p)
	{
		this.pizza = p;
	}
	
	public  double  calculePrix () 
	{
		return  pizza.calculePrix ();
	}
	
	public  String  afficheDescription () 
	{
		return  pizza.afficheDescription ();
	}

}