package pacotemain;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Circle;
import entites.Rectangle;
import entites.Shape;
import enume.Collor;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
        List<Shape> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbes of Shape");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++ ) 
		{
			System.out.println("Shape #"+i+1+" data");
			System.out.println("Rectangle or circle? (r/c)");
			char s = sc.next().charAt(0);
			System.out.println("Color? (BLACK/BLUE/RED)");
			Collor color = Collor.valueOf(sc.next());
			if(s == 'r') 
			{
				System.out.println("Widht:");
				Double width = sc.nextDouble();
				System.out.println("Height:");
		        Double height = sc.nextDouble();
		        lista.add(new Rectangle(color,width,height));
		        
			}
			else if(s=='c') 
			{
				System.out.println("Radius:");
				Double radius = sc.nextDouble();
				lista.add(new Circle(color,radius));
			}
		}
		System.out.println("Shape Areas");
		System.out.println();
		for(Shape c : lista) 
		{
			System.out.println("Area: "+String.format("%.2f", c.Area()));
		}
		
		
		sc.close();
	}

}
