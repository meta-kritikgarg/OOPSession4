//Interface for action method
public interface Action {

	/**
	 * Method for print choices
	 */
	public void action() ;
	
	/**
	 * Method to perform action
	 * @param int index choice
	 */
	public void actionPerform(int index);
	
	/**
	 * Method to get size of choices
	 * @return
	 */
	public int getSize();
	
}
