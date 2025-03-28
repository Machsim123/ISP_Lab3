package MAX3;

public class Proiect 
{
	private String titlu;
	private String coordonator;
	public Proiect(String t, String c)
	{
		this.titlu = t;
		this.coordonator = c;
	}
	public void afisare()
	{
		System.out.println("titlu: "+titlu+" coordonator: "+coordonator);
	}
}
