package JXW.Component;

public class Label extends Comp {

    public Label(String text) {
        super("p", text);
    }

    public void bold(){
        this.addAttr("style", "bold");
    }

}

