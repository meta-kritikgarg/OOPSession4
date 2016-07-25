
public class MenuItem extends Menu {
	
	public MenuItem(String inName) {
		this.name = inName;
	}
	
	@Override
	public void action() {
		System.out.println(getName());
	}
	
	public void actionPerform() {
		System.out.println(getName()+" is choosed");
	}
}
