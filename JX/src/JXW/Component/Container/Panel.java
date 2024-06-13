package JXW.Component.Container;

import JXW.Component.Comp;

public class Panel extends Container {

    public Panel() {
        super("div");
    }

    public Panel(Comp c) {
        super("div");
        this.addComponent(c);
    }

}
