package XML;

import java.util.List;

public class ElementAdapter
    implements Element
{


  protected  ElementXMLCompose  adapte;

	public  ElementAdapter(ElementXMLCompose  adapte)
	{
		this.adapte = adapte;
	}



  public int getNombreEnfants() {
    return  adapte.getElementsEnfants().size();
	}

  public  ElementXML  getEnfant(int  index)
	{
		List <ElementXML > enfants = adapte.getElementsEnfants();
		return  enfants.get(index);
	}

  public  ElementXML  getCompar(String  tag)
	{
		List <ElementXML > enfants = adapte.getElementsEnfants ();
		//foreach
    for (ElementXML nom : enfants) {
				if (nom.getTag().equals(tag))
			return  nom;
		}
	return  null;
	}
}
