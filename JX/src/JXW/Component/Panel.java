package JXW.Component;

import Abstract.HTML;

public class Panel extends Comp{

    public Panel() {
        super("div", "");
    }

    public Panel(HTML c) {
        super("div", "");
        this.addComponent(c);
    }
}
