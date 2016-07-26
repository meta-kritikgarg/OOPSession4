import java.util.Scanner;


public class Shape {

	public static void main(String[] args) {

		Shape shapeObj = new Shape();
		
		ActionableMenuItem shape = new ActionableMenuItem("shape");
		ActionableMenuItem circle = new ActionableMenuItem("circle");
		ActionableMenuItem line = new ActionableMenuItem("line");
		ActionableMenuItem square = new ActionableMenuItem("square");

		//subMenu for circle
		MenuItem radiusSizeA = new MenuItem("Radius sizeA");
		MenuItem radiusSizeB = new MenuItem("Radius sizeB");
		MenuItem radiusSizeC = new MenuItem("Radius sizeC");
		
		//subMenu for line
		MenuItem lineSizeA = new MenuItem("Line sizeA");
		MenuItem lineSizeB = new MenuItem("Line sizeB");
		MenuItem lineSizeC = new MenuItem("Line sizeC");
		
		//subMenu for square
		MenuItem squareSizeA = new MenuItem("Square sizeA");
		MenuItem squareSizeB = new MenuItem("Square sizeB");
		MenuItem squareSizeC = new MenuItem("Square sizeC");

		//add subMenu to circle
		circle.addMenu(radiusSizeA);
		circle.addMenu(radiusSizeB);
		circle.addMenu(radiusSizeC);
		
		//add subMenu to circle
		line.addMenu(lineSizeA);
		line.addMenu(lineSizeB);
		line.addMenu(lineSizeC);
		
		//add subMenu to circle
		square.addMenu(squareSizeA);
		square.addMenu(squareSizeB);
		square.addMenu(squareSizeC);
		
		//Add menu
		shape.addMenu(circle);
		shape.addMenu(line);
		shape.addMenu(square);
		
		//Implementing Menus
		shape.action();
		int userInput = shapeObj.getIntfromUser("Choice (Start from 0)",shape.getSize());
		shape.actionPerform(userInput);
		Menu x = shape.items.get(userInput);
		
		int userInput2 = shapeObj.getIntfromUser("Choice (Start from 0)",x.getSize());
		x.actionPerform(userInput2);
	}
	
	
	/**
	 * Method to read integer data from standard input
	 * @param Name of variable to print 
	 * @return int value of integer
	 */
	public int getIntfromUser(String Name,int maxValue) {
		Scanner s= new Scanner(System.in);
		int number = 0;		
		while(true){
			try {
				System.out.println("Enter "+Name);
				number=s.nextInt();
				if(number>=0&& number < maxValue){
					break;
				}
				else{
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}
		}
		return number;
	}
}
