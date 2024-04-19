class Box{
	private double height;
	private double width;
	private double length;
	public double area;
	Box(){
		System.out.println("Empty Constructor called");
	}
	Box(double l,double w, double h){
		System.out.println("Parameterized Constructor");
		setData(l,w,h);
	}
	//Setter Methods
	public void setData(double l, double w, double h){
		length=l;
		width=w;
		height=h;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public double getArea(){
		area=length*width;
		return area;
	}
	public void showBox(){
		System.out.println("Length :"+length);
		System.out.println("Width :"+width);
		System.out.println("Height :"+height);
		System.out.println("Area :"+area);
	}
	
}