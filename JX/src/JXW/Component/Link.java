package JXW.Component;

public class Link extends Comp{
    public Link(String text, String url) {
        super("a", text);
        this.addAttr("href",url);
    }

    public Link(String text, String url, String id) {
        super("a", text);
        this.addAttr("href",url);
        this.id(id);
    }
}
