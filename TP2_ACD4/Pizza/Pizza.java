package Pizza;

public  abstract  class  Pizza 
{
	protected  String  description = "";
	
	public  String  afficheDescription () 
	{
		return  description;
	}
	
	public  abstract  double  calculePrix ();
}