package JXW.Component.Container;

import JXW.Component.Comp;

public class Page extends Comp {
    public Page(String name) {
        super("div", "");
        this.id(name);
        this.hide();
    }
}
