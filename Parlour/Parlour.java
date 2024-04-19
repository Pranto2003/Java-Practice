class Parlour{
	private String service;
	private String name;
	private String id;
	
	public Parlour(String service,String name,String id){
		setService(service);
		setName(name);
		setID(id);
	}
	
	public void setService(String service){
		this.service=service;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setID(String id){
		this.id=id;
	}
	
	public String getService(){
		return this.service;
	}
	public String getName(){
		return this.name;
	}
	public String getID(){
		return this.id;
	}
	
	public void showInfo(){
		System.out.println("Service Name :"+service);
		System.out.println("Customer Name :"+name);
		System.out.println("Customer ID :"+id);
	}
	
}