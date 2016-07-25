import java.util.ArrayList;


public class ActionableMenuItem extends Menu {
	

	ArrayList<Menu> items = new ArrayList<Menu>();
	
	public ActionableMenuItem(String inName) {
		this.name= inName;
	}
	
	@Override
	public void action() {
		for (Menu menu : items) {
			System.out.println(menu.getName());
		}
	}
	
	

	public void actionPerform(int index) {
		items.get(index).action();
	}
	
	public void addMenu(Menu inMenu) {
		items.add(inMenu);
	}
	
	
}
