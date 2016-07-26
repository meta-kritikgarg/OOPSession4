import java.util.ArrayList;

public class ActionableMenuItem extends Menu {
	
	ArrayList<Menu> items = new ArrayList<Menu>();
	
	/**
	 * Constructor 
	 * @param String inName name of menu 
	 */
	public ActionableMenuItem(String itemName) {
		this.name= itemName;
	}
	
	@Override
	public void action() {
		for (Menu menu : items) {
			System.out.println(menu.getName());
		}
	}
	
	/**
	 * To select sub-menu 
	 */
	public void actionPerform(int index) {
		items.get(index).action();
	}
	
	/**
	 * To add sub menu
	 * @param inMenu
	 */
	public void addMenu(Menu inMenu) {
		items.add(inMenu);
	}

	@Override
	public int getSize() {
		return items.size();
	}	
}
