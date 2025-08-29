import java.util.Scanner;

class Rectangle
{
	
	    public void area()
		{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of Rectangle:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        int area = (int) Math.floor(length * width);
		System.out.println("Area of rectangle:" + area);
        }
}

class Square extends Rectangle
{
	
	public void area()
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square:");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of square:" + area);
    }
}

class Triangle extends Rectangle
{
	
 
    public void area()
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and height of Traingle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        int area =(int)Math.floor(0.5 * base * height);
        System.out.println("Area of triangle:" + area);
    }
}

class Calculation
{
    public static void main(String args[])
	{
	   Rectangle r = new Rectangle();
        r.area();
        r = new Square();
        r.area();
        r = new Triangle();
        r.area();
    }
}