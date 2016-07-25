
public class Shape {

	public static void main(String[] args) {

		ActionableMenuItem shape = new ActionableMenuItem("shape");
		ActionableMenuItem circle = new ActionableMenuItem("circle");
		ActionableMenuItem line = new ActionableMenuItem("line");
		ActionableMenuItem squre = new ActionableMenuItem("squre");

		MenuItem sizeA = new MenuItem("sizeA");
		MenuItem sizeB = new MenuItem("sizeB");
		MenuItem sizeC = new MenuItem("sizeC");

		circle.addMenu(sizeA);
		circle.addMenu(sizeB);
		circle.addMenu(sizeC);
		
		line.addMenu(sizeA);
		line.addMenu(sizeB);
		line.addMenu(sizeC);
		
		squre.addMenu(sizeA);
		squre.addMenu(sizeB);
		squre.addMenu(sizeC);
		
		shape.addMenu(circle);
		shape.addMenu(line);
		shape.addMenu(squre);
		
		shape.action();
		shape.actionPerform(0);
		sizeA.actionPerform();

		
	}

}
