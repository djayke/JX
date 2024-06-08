package JXW.Component.Basic;

import JXW.Component.Comp;

public class Button extends Comp {

    public Button(String text) {
        super("button", text);
    }

    public Button(String text, String id) {
        super("button", text);
        this.id(id);
    }
}
