public class Card
{
	private String name;
	private ImageIcon image
	public Card (String parName, ImageIcon parImage)
	{
		name = parName;
		image = parImage;
	}
	
	public String ToString()
	{
		return name;
	}
	
	public boolean equals(Card parCard)
	{
		return ( name.equals( parCard.getName()));
	}
}
