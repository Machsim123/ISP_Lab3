package MAX3;
import java.util.ArrayList;
public class Grupa {
	ArrayList<Student> studenti;
	String identificator;
    int numarStudenti;
    // public Grupa(string id);
    void addStudent(Student/*!*/ persoana)
    {
    	studenti.add(persoana);
    }
    Student getStudent (int i)
    {
    	return studenti.get(i);
    }
    int getNumarStudenti (int i)
    {
    	return this.numarStudenti;
    }
    void afisare()
    {
    	System.out.println("identificator: " + identificator + " numarStudenti: " + numarStudenti);
    	for(Student s:studenti)
    		s.afisare();
    }
	public Grupa(String id)
	{
		this.identificator = id;
		this.studenti = new ArrayList<Student>();
	}
}
