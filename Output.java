class Output {
static{System.out.println("static block 2 called ");}
	
Output() { System.out.println("Constructor called"); }
	
static{System.out.println("static block 1 called ");}
	
Output(int b) { 
print_j();
System.out.println("Constructor called"); }
	
{System.out.println("Block is called");}
	
public void static_count(){
System.out.println("Total Static blocks: 2");}
	
public void print_j()
{System.out.print("Total Static blocks: 3");}
	
public static void main(String args[])
{
System.out.println("Welcome to Java Class");
Output t1 = new Output();
Output t2 = new Output(6);
t1.static_count();
}
}
