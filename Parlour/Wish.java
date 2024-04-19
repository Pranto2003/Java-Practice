public class Wish extends Parlour{
	private String mobile;
	
	public Wish(String service,String name,String id,String mobile){
		super(service,name,id);
		setMobile(mobile);
	}
	public void setMobile(String mobile){
		this.mobile=mobile;
	}
	public String getMobile(){
		return this.mobile;
	}
	
	public void showInfo(){
		super.showInfo();
		System.out.println("Mobile Number :"+mobile);
	}
	
	
}