package seedu.addressbook.commands;

/**
 * Represents an incorrect command. Upon execution, produces some feedback to
 * the user.
 */
public class IncorrectCommand extends Command {

    public final String feedbackToUser;

    public IncorrectCommand(String feedbackToUser) {
        this.feedbackToUser = feedbackToUser;
    }

    @Override
    public CommandResult execute() {
        return new CommandResult(feedbackToUser);
    }

    // returns false that means data not mutated
    public boolean isMutating() {
        return false;
    }
}
