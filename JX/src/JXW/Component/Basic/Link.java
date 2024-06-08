package JXW.Component.Basic;

import JXW.Component.Comp;

public class Link extends Comp {
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
