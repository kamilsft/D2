package DesignPatternClasses;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commandHistory = new ArrayList<>();
    private Command currentCommand;

    // Set the command to be executed
    public void setCommand(Command command) {
        this.currentCommand = command;
    }

    // Execute the current command
    public void executeCommand() {
        if (currentCommand != null) {
            currentCommand.execute();
            commandHistory.add(currentCommand);
        }
    }

    // Undo the last executed command
    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        }
    }

    // Get the command history
    public List<Command> getCommandHistory() {
        return commandHistory;
    }
}