package JXW.Component.Container;

import JXW.Component.Comp;
import JXW.Component.Input.Base.AbstractInput;

public class Form extends Comp {
    public Form() {
        super("form", "");
        this.addComponent(addSubmit());
    }

    public void addToForm(Panel container){
        this.addComponent(container);
    }

    private Submit addSubmit(){
        return new Submit();
    }

    private class Submit extends AbstractInput {
        public Submit() {
            super("submit");
        }
    }
}
