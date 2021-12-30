package constructors;

public class Constructors03 {

	public static void yaz(Constructors03 obj) {
		System.out.println("Adi    : " + obj.name + "\nSoyadi : " + obj.surname + "\nYasi   : " + obj.age
				+ "\nUlke   : " + obj.country);
	}

	String name="Ali";
	String surname="Veli";
	int age=49;
	String country="Elli";

	public Constructors03() {

	}

	public	Constructors03(String name, String surname, int age, String country) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.country = country;

	}

	public static void main(String[] args) {

		Constructors03 me = new Constructors03("Celil", "Ozkaynak", 32, "Turkey");
		Constructors03 you = new Constructors03();
		yaz(me);
		System.out.println("\n==============\n");
		yaz(you);

		 
	}

}
