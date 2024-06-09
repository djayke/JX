package JXW.Component.Basic;

import JXW.Component.Comp;

public class Nav extends Comp {
    public Nav() {
        super("nav", "");
    }

    public void addLink(String url, String content) {
        this.addComponent(new Link(content,url));
    }
}