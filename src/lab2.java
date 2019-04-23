import java.util.Scanner;

public class lab2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char response ='y';
		double length;
		double width;
		double height;
		
		
		while(response == 'y') {
			System.out.println("Please enter the length of the room");
			length = scan.nextDouble();
		
			System.out.println("Please enter the width of the room");
			width = scan.nextDouble();
			
			System.out.println("Please enter the height of the room");
			height = scan.nextDouble();
		
			System.out.println("Area of the room is " + length * width);
			
			System.out.println("Perimeter of the room is " +(2 * (width + length)) );
			
			System.out.println("Volume of the room is " + (length * width * height));
			
			System.out.println("Would you like to continue y for yes n for no");
			
			response = scan.next().charAt(0); 
		}
	}
	}

