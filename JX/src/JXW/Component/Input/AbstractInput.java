package JXW.Component.Input;

import JXW.Component.Comp;

public class AbstractInput extends Comp {
    public AbstractInput(String type) {
        super("input", "");
        this.addAttr("type",type);
    }
    public AbstractInput(String type, String id) {
        super("input", "");
        this.addAttr("type",type);
        this.id(id);
    }
}
