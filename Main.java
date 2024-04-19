public class Main{
	static{ System.out.println("House of Dead");}
	
	public static void main(String []args)
	{
		Warrior obj = new Warrior();
        Warrior obj2 = new Warrior();
		obj.show();
		obj.revive();
		obj2.show();
		System.out.println("Game End");
	}  
}