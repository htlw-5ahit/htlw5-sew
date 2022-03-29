public class AppendCommand implements Command {

    private StringBuilder sb;
    private String s, backup;

    public AppendCommand(StringBuilder sb, String s) {
        this.sb = sb;
        this.s = s;
    }

    @Override
    public void execute() {
        backup = sb.toString();
        sb.append(s);
    }

    @Override
    public void undo() {
        sb.replace(0, sb.length(), backup);
    }
}
