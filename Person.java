package streams;


import java.util.ArrayList;

public class Person {
	String firstName;
	String lastName;
	int age;
	String gender; //M|F
	String city;
	int salary;
	boolean isWorking;
	
	ArrayList<String> pets = new ArrayList<String>();
	static final int MIN_ADULT_AGE = 18;
	static final int MIN_PENSION_AGE = 60;
	static ArrayList<Person> all = new ArrayList<Person>();
	Person(String first, String last, String s, int age, int money, 
			String city, ArrayList<String> pets) {
		this.firstName = first;
		this.lastName = last;
		this.age = age;
		this.salary = money;
		this.isWorking = this.salary > 0; 
		this.pets = pets;
		this.city = city;
		this.gender = s;
		Person.all.add(this);
	
	
	}
	String getLastName() {
		return this.lastName;
	}
	String getFirstName() {
		return this.firstName;
	}
	String getCity() {
		return this.city;
	}
	String yngPersCity() {
		return Main.yngPersCity();
	}
	boolean isDoc() {
		return this.firstName.startsWith("Dr.");
	}
	boolean isAdult() {
		return !this.isKid() && !this.isPensioner();
	}
	int getAge() {
		return this.age;
	}
	boolean isKid() {
		return this.age < MIN_ADULT_AGE;
	}
	boolean isPensioner() {
		return this.age >= MIN_PENSION_AGE;
	}
	boolean isMale() {
		return this.gender.equals("M");
	}
	boolean isFemale() {
		return !this.isMale();
	}
	String getFullname() {
		return this.firstName+" "+this.lastName;
	}
	public String toString() {
		return this.getFullname()+" is " +this.age+"\n"
				+(this.isMale() ? "He": "She")+" lives in " +this.city
				+(this.isWorking ? " and earns " +this.salary+"€" : "and is unemployed")+"\n"
				+(this.isMale() ? "He": "She")+" has " 
				+this.pets.size()+" pet"+(pets.size()==1?"":"s")+": " +this.pets+"\n";
	}
}

