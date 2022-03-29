public class DeleteCommand implements Command {

    private StringBuilder sb;
    private String backup;
    private int start, end;

    public DeleteCommand(StringBuilder sb, int start, int end) {
        this.sb = sb;
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
        backup = sb.toString();
        sb.delete(start, end);
    }

    @Override
    public void undo() {
        sb.replace(0, sb.length(), backup);
    }
}
