class Ou {
static{System.out.println("static block 2 called ");}

static{System.out.println("static block 1 called ");}
	
Ou(int b) { 
object_creation();
System.out.println("Constructor called"); }
	
Ou() { 
System.out.println("Empty Constructor called"); }
	
{
System.out.println("Block called");
}
public void object_creation()
{
Ou t1 = new Ou();}
	
public static void main(String args[])
{
System.out.println("Welcome to Java Class");
Ou t1 = new Ou(3);
t1.object_creation();
Ou t2 = new Ou(6);
new Ou();
System.out.println("Thank you for learning");
		
	}
}
