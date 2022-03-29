public class InsertStringCommand implements Command {

    private StringBuilder sb;
    private String s, backup;
    private int offset;

    public InsertStringCommand(StringBuilder sb, int offset, String s) {
        this.sb = sb;
        this.s = s;
        this.offset = offset;
    }

    @Override
    public void execute() {
        backup = sb.toString();
        sb.insert(offset, s);
    }

    @Override
    public void undo() {
        sb.replace(0, sb.length(), backup);
    }
}
