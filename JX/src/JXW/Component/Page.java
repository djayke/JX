package JXW.Component;

public class Page extends Comp{
    public Page(String name) {
        super("div", "");
        this.id(name);
        this.hide();
    }
}
