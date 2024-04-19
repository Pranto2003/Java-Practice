public class PatientList{
	private Person persons[];
	
	//parameterized constructor
	public PatientList(int size){
		persons[]=new Person[size];
	}
	
	//adding Persons
	public void addPerson(Person p){
		boolean adding=false;
		for(int i=0; i<persons.length; i++){
			if(persons[i]==null){
				persons[i]=p;
				adding=true;
				break;
			}
		}
		if(adding){
			System.out.println("Person added Successfully");
		}
		else{
			System.out.println("Not enough Space");
		}
	}
	
	//removing Persons
	public void removePerson(Person p){
		boolean removing=false;
		for(int i=0; i<persons.length; i++){
			if(persons[i]==p){
				persons[i]=null;
				removing=true;
				break;
			}
		}
		if(removing){
			System.out.println("Person Succesfully Removed");
		}
		else{
			System.out.println("Person Not Found");
		}
	}
	
	
	
}