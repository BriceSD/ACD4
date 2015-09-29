package Pizza;

public class TestPizza 
{
		public  static  void  main(String [] args) 
		{
			/**Pizza 1*/
			Pizza  pizza1 = new  PizzaPateFine ();
			pizza1 = new  BouletteViande(pizza1);
			pizza1 = new  Fromage(pizza1);
			pizza1 = new  OliveNoir(pizza1);
			pizza1 = new  Oignon(pizza1);
			System.out.println (" Première  pizza : "+ pizza1. afficheDescription ()
								+ "\n Prix Total: " + pizza1. calculePrix ());
			
			/**Pizza 2 */
			Pizza  pizza2 = new  PizzaFourreeFromage ();
			pizza2 = new  Jambon(pizza2);
			pizza2 = new  Fromage(pizza2);
			pizza2 = new  Champignon(pizza2);
			System.out.println (" Seconde  pizza : "+ pizza2. afficheDescription ()
								+ "\n Prix Total: " + pizza2. calculePrix ());
			
			
			/**Pizza 3 */
			Pizza  pizza3 = new  PizzaClassique();
			pizza3 = new  Jambon(pizza3);
			pizza3 = new  Fromage(pizza3);
			pizza3 = new  Champignon(pizza3);
			System.out.println (" Troisieme  pizza : "+ pizza3. afficheDescription ()
								+ "\n Prix Total: " + pizza3. calculePrix ());
		}
		
	
}
