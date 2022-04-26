package streams;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {

		Config.generate();
		// Config.seeExample();
		
		averageSalary("Adult");
		oldestPenc("Valmiera");
		averageSalary("Doctor");
		petsTotal("total");
		petsTotal("Fluffy");
		yngPersCityAvgAge();
		uniqNames("first name");
		uniqNames("last name");
	}

	static void oldestPenc(String city) {
		Comparator<Person> comp = Comparator.comparing(Person::getAge);
		Person op = Person.all.stream()
			.filter(penc -> penc.isPensioner())
			.filter(penc -> penc.isWorking)
			.filter(penc -> penc.city.equals(city))
			.max(comp)
			.get();
		System.out.println("The oldest pens in "+city+" is Mr. "+op.getFullname()+" ("+op.age+" years old)");
	}
	
	static void averageSalary(String type) {
		double z = 0;
		if (!type.equals("Doctor") && !type.equals("Adult")) {
			System.out.println("You've entered the type incorrectly");
		} else {
			z = Person.all.stream()
		        .filter(twu -> (type.equals("Doctor") && twu.isDoc()) || (type.equals("Adult") && twu.isAdult()))  
		        .mapToDouble(twu -> twu.salary)
		        .average()            
		        .orElse(0);
			System.out.println("The avarage salary of an "+type+" is: "+z);
		}
	}
	
    static void petsTotal(String name) {
    	long petCount = 0;
    	petCount = Person.all.stream()
        	.flatMap(tres -> tres.pets.stream())
            .filter(tres -> name.equalsIgnoreCase("total") ? true : (tres.equals(name)))
            .count();
        System.out.println("The count of "+name+" is: "+ petCount);
    }
    
    static String yngPersCity() {
        Comparator<Person> comp = Comparator.comparing(Person::getAge);
        Person po = Person.all.stream()
            .min(comp)
            .get();            
        return po.city;
    }
    
    static void yngPersCityAvgAge() {
		double fc = Person.all.stream()
			.filter(p -> p.city.equals(p.yngPersCity()))
		    .mapToInt(Person::getAge)
		    .average()
		    .orElse(0);
    	System.out.println("Average age in city where the youngest person lives: "+fc+" ("+yngPersCity()+")");
    }
    
    static void uniqNames(String nameType) { //TODO improve this method to be more DRY
    	if (nameType.equalsIgnoreCase("first name")) {
    		long pte = Person.all.stream()
    			.map(Person::getFirstName)
    			.map(dr -> dr.replace("Dr. ", ""))
                .distinct()
                .count();
    	System.out.println("Unique first name count: "+pte);
    	} else if (nameType.equalsIgnoreCase("last name")) {
    		long pte = Person.all.stream()
    			.map(Person::getLastName)
                .distinct()
                .count();
    		System.out.println("Unique last name count: "+pte);
    	} else {
    		System.out.println("Invalid name type");
    	} 
    }
    
}

