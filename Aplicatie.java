package MAX3;

public class Aplicatie {

	public static void main(String[] args) {
		Proiect proiect = new Proiect("titlu","coordonator");
		Student stud = new Student("Ioana");
		stud.addProiect(proiect);
		stud.afisare();
		// proiect1.afisare();
		
		Grupa grupa33 = new Grupa("33");
		Student stud1 = new Student("Ioana2");
		Student stud2 = new Student("Ioana3");
		Student stud3 = new Student("Ioana4");
		Proiect proiect2 = new Proiect("titlu2","coordonator2");
		Proiect proiect3 = new Proiect("titlu3","coordonator3");
		Proiect proiect4 = new Proiect("titlu4","coordonator4");
		
		grupa33.addStudent(stud1);
		grupa33.addStudent(stud2);
		grupa33.addStudent(stud3);
		
		stud1.addProiect(proiect2);
		stud2.addProiect(proiect3);
		stud3.addProiect(proiect4);
		
		grupa33.afisare();
	}

}
