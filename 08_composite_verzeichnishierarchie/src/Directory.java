import java.io.File;
import java.util.LinkedList;

public class Directory implements FileObject {

    private File file;
    private LinkedList<FileObject> files;

    public Directory(File file) {
        this.file = file;
        this.files = new LinkedList<>();
    }

    public Directory(String file) {
        this.file = new File(file);
        this.files = new LinkedList<>();
    }

    public void insertFile(FileObject obj) {
        files.add(obj);
    }

    @Override
    public String getName() {
        return file.getName();
    }

    @Override
    public long getSize() {
        long size = 0L;
        for (FileObject file : files) size += file.getSize();
        return size;
    }

    public LinkedList<FileObject> getFiles() {
        return files;
    }
}
