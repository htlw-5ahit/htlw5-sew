import java.io.File;

public class Document implements FileObject {

    private File file;

    public Document(File file) {
        this.file = file;
    }

    public Document(String file) {
        this.file = new File(file);
    }

    @Override
    public String getName() {
        return file.getName();
    }

    @Override
    public long getSize() {
        return file.length();
    }

    public File getFile() {
        return file;
    }
}
