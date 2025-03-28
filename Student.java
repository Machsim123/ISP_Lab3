package MAX3;

public class Student 
{
	private String nume;
	private Proiect proiect;
	public Student(String num)
	{
		this.nume=num;
	}
	public void addProiect(Proiect p)
	{
		this.proiect = p;
	}
	public void afisare()
	{
		System.out.println("nume: " + nume + " proiect:");
		proiect.afisare();
	}
}
