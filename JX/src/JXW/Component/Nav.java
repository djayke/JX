package JXW.Component;

public class Nav extends Comp{
    public Nav() {
        super("nav", "");
    }

    public void addLink(String url, String content) {
        this.addComponent(new Link(content,url));
    }
}
