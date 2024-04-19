class Output_trace {
static int i;
int j;
static{
 i++;
System.out.println("static block 2 called ");}

Output_trace() { System.out.println("Constructor called"); }

static{
i++;
System.out.println("static block 1 called ");}
	
Output_trace(int b) { 
	j=b;
	print_j();
	System.out.println("Constructor called"); }

public void static_count(){
System.out.println("Total Static blocks: "+ i);}

public void print_j(){
System.out.println("value of J: "+ j);}

public static void main(String args[])
{
Output_trace t1 = new Output_trace();
Output_trace t2 = new Output_trace(6);
t1.static_count();
}
}
