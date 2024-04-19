import java.lang.*;
public class Start{
	public static void main(String[] args){
		Box b=new Box();
		Box b1=new Box(10,20,30);
		b.setData(12,15,18);
		b.showBox();
		b1.showBox();
		
	}
}