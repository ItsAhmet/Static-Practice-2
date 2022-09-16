import java.util.Scanner;

public class StaticPractice2 {
	//Method 1: Blastoff, outputs a countdown from 5 to 1 and then says lift off
	public static String blastoff() {
		return ("5... 4... 3... 2... 1... BLASTOFF!!!");
	}
	//Method 2: Color guesser, takes a String color as a parameter and 
	//returns true or false if the parameter matches your favorite color
	public static boolean color(String color) {
		
		return color.equals("Red") ;
	}
	//Method 3: Cuboid volume, takes the measurements of a cuboid as parameters
	//returns the volume of a cuboid
	public static double calcCuboid(double x, double y, double z){
		double vol = x*y*z;
		return vol;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		//Call to method 1
		System.out.println(blastoff());
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//Call to method 2
		Scanner keyboard1 = new Scanner(System.in);
		String colors;
		System.out.println("Guess a color:");
		colors =keyboard1.nextLine();
		System.out.println("You got the answer "+ color(colors));
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//Call to method 3
		double length;
		double width;
		double height;
		Scanner keyboard = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter length of cuboid:");
		length =keyboard.nextInt();
		
		System.out.println("Enter width of cuboid:");
		width =keyboard.nextInt();
		
		System.out.println("Enter height of cuboid:");
		height =keyboard.nextInt();
		
		System.out.println("The volume of the cuboid is "+calcCuboid(length, width, height));
	}

}
