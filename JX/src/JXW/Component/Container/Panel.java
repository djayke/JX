package JXW.Component.Container;

import JXW.Component.Comp;

public class Panel extends Comp {

    public Panel() {
        super("div", "");
    }

    public Panel(Comp c) {
        super("div", "");
        this.addComponent(c);
    }

}
