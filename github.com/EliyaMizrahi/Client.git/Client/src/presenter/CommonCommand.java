package presenter;

/**
 * The CommonCommand program implements an application that organize all
 * the common methods of command methods and implement the methods of the Command interface.
 * CommonCommand consist from: 1. Controller
 * 
 * @author Eliya Mizrahi & Mor Mordoch  
 * @version 1.0
 * @since 10-10-2015
 */

public abstract class CommonCommand implements Command {
	protected Presenter presenter;

	/**
	 * Constructor
	 * @param presenter
	 */
	public CommonCommand(Presenter presenter) {
		this.presenter = presenter;
	}

	public abstract void doCommand(String command);
}
