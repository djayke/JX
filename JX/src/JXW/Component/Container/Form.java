package JXW.Component.Container;

import JXW.Component.Comp;
import JXW.Component.Input.AbstractInput;

public class Form extends Comp {
    public Form()
    {
        super("form", "");
        this.addComponent(addSubmit());
    }

    private Submit addSubmit()
    {
        return new Submit();
    }

    /**
     * Classe interne pour le submit form
     */
    private class Submit extends AbstractInput
    {
        public Submit()
        {
            super("submit");
        }
    }
}
