public class Person{
	private String Name;
	private String ID;
	private int Age;
	private String Gender;
	
	//parameterized constructor
	public Person(String Name, String ID, int Age, String Gender){
		setName(Name);
		setID(ID);
		setAge(Age);
		setGender(Gender);
	}
	
	//setter methods
	public void setName(String Name){
		this.Name=Name;
	}
	public void setID(String ID){
		this.ID=ID;
	}
	public void setAge(int Age){
		this.Age=Age;
	}
	public void setGender(String Gender){
		this.Gender=Gender;
	}
	
	//getter methods
	public String getName(){
		return this.Name;
	}
	public String getID(){
		return this.ID;
	}
	public int getAge(){
		return this.Age;
	}
	public String getGender(){
		return this.Gender;
	}
	
	//display data
	public void ShowDetails(){
		System.out.println("Name :"+this.Name);
		System.out.println("ID :"+this.ID);
		System.out.println("Age :"+this.Age);
		System.out.println("Gender :"+this.Gender);
	}
}