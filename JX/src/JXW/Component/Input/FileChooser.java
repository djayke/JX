package JXW.Component.Input;

public class FileChooser extends AbstractInput {
    public FileChooser() {
        super("file");
    }

    public FileChooser(String path) {
        super("file", path);
    }

}