package JXW.Component;

import Abstract.HTML;

public class Form extends Comp{
    public Form(String text) {
        super("form", "");
        this.addComponent(addSubmit());
    }

    public void addToForm(Panel container){
        this.addComponent(container);
    }

    private Submit addSubmit(){
        return new Submit();
    }

    private class Submit extends AbstractInput{
        public Submit() {
            super("submit");
        }
    }
}
