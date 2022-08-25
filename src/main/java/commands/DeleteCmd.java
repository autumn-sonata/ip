package commands;

import drivers.Storage;
import drivers.TaskList;
import drivers.UI;
import exceptions.TumuException;
import tasks.Task;

/**
 * Class to be executed when a delete command is
 * issued by the user.
 */
public class DeleteCmd extends Command {
    private int taskIndex;

    /**
     * Constructor for the DeleteCmd class.
     * @param body The rest of the instruction issued by the user after command.
     * @throws NumberFormatException
     */
    public DeleteCmd(String body) throws NumberFormatException {
        taskIndex = Integer.parseInt(body);
    }

    /**
     * Executes the command and gives the appropriate
     * feedback to the user.
     * @param tasks TaskList containing all the tasks currently available.
     * @param ui Specifies how the program interacts with the user.
     * @param storage Stores and retrieves data from a local .txt file.
     * @throws TumuException Parent exception for the program.
     */
    @Override
    public void execute(TaskList tasks, UI ui, Storage storage) throws TumuException {
        Task removedTask = tasks.deleteTask(taskIndex);
        if (removedTask != null) {
            ui.notifyUser("Alright, I have removed this task for you:\n\t\t" + removedTask);
            ui.notifyUser(String.format("You have %d task(s) in the list.", tasks.getListSize()));
        }

        saveUserTasks(storage, tasks);
    }
}
