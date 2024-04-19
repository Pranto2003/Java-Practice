class Out {
static{System.out.println("static block 2 called ");}
	
Out() { System.out.println("Constructor called"); }
	
static{System.out.println("static block 1 called ");}
	
Out(int b) { 
object_creation();
System.out.println("Constructor called"); }
	
{System.out.println("Block is called");}
	
public void object_creation()
{
Out t1 = new Out();}
	
public static void main(String args[])
{
System.out.println("Welcome to Java Class");
Out t1 = new Out();
t1.object_creation();
Out t2 = new Out(6);
System.out.println("Thank you for learning");		}
}
