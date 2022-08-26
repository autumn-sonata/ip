package commands;

import drivers.Storage;
import drivers.TaskList;
import drivers.UI;

/**
 * Class to be executed when the user wants to exit the program.
 */
public class EndChatBotCmd extends Command {
    /**
     * Executes the command and gives the appropriate
     * feedback to the user.
     * @param tasks TaskList containing all the tasks currently available.
     * @param ui Specifies how the program interacts with the user.
     * @param storage Stores and retrieves data from a local .txt file.
     */
    @Override
    public void execute(TaskList tasks, UI ui, Storage storage) {
        ui.notifyUser("Goodbye, and have a nice day ahead! :D");
    }
}
