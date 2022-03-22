import java.io.File;

public class Parser {

    private Directory rootDirectory;

    public Parser(String path) {
        this.rootDirectory = new Directory(path);
        File rootFile = new File(path);

        parseDirectory(rootFile, rootDirectory);
    }

    private void parseDirectory(File curFile, Directory curDirectory) {
        File[] files = curFile.listFiles();
        assert files != null;
        for (File file : files) {
            if (file.isDirectory()) {
                // create new directory and add to last directory
                Directory newDir = new Directory(file);
                curDirectory.insertFile(newDir);

                // call recursive
                parseDirectory(file, newDir);

            } else {
                // add document to current directory
                curDirectory.insertFile(new Document(file));
            }
        }
    }

    public Directory getRootDirectory() {
        return rootDirectory;
    }

    public void printFileTree(Directory dir, int i) {
        for (FileObject file : dir.getFiles()) {
            if (file instanceof Directory) {
                for (int j = 0; j < i; j++) System.out.print("\t");
                System.out.println("- " + file.getName());
                printFileTree((Directory) file, i+1);
            } else {
                for (int j = 0; j < i; j++) System.out.print("\t");
                System.out.println("- " + file.getName());
            }
        }
    }

    public void printFileTree() {
        printFileTree(this.getRootDirectory(), 0);
    }
}
