class ShapeArea
{
	public static void main(String[] args)
	{
	String shapes="Triangle";
	double Area1=3.14*7*7;
	int Area2=5*5;
	int Area3=8*6;
	int Area4=(1*4*8)/2;
	switch(shapes)
	{
		case "Circle":
		System.out.println("Area of the circle:"+Area1);
		break;
		case "Square":
		System.out.println("Area of the square:"+Area2);
		break;
		case "Rectangle":
		System.out.println("Area of the Rectangle:"+Area3);
		break;
		case "Triangle":
		System.out.println("Area of the Triangle:"+Area4);
		break;
		default:
		System.out.println("Thankyou");
		break;
	}
	}
}