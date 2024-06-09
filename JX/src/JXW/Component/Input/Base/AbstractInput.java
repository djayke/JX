package JXW.Component.Input.Base;

import JXW.Component.Comp;

public class AbstractInput extends Comp {
    public AbstractInput(String type) {
        super("input", "");
        this.addAttr("type",type);
    }
    public AbstractInput(String type, String text) {
        super("input", text);
        this.addAttr("type",type);
    }
}
