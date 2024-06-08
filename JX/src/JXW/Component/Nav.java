package JXW.Component;

public class Nav extends Comp{
    public Nav(String text, String url) {
        super("a", text);
        this.addAttr("href",url);
    }

    public Nav(String text, String url, String id) {
        super("a", text);
        this.addAttr("href",url);
        this.id(id);
    }
}
