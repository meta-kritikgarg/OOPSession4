//Leaf class of composite design pattern
public class MenuItem extends Menu {
	
	/**
	 * Constructor 
	 * @param String inName name of menu 
	 */
	public MenuItem(String inName) {
		this.name = inName;
	}
	
	@Override
	public void action() {
		System.out.println(getName()+" is choosed");
	}
	
	@Override
	public void actionPerform(int index) {
		action();
	}

	@Override
	public int getSize() {
		return 0;
	}
}
