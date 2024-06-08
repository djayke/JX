package JXW.Component;

public class TextInput extends Comp {
    public TextInput() {
        super("input", "");
        this.addAttr("type","text");
    }

    public TextInput(String placeHolder, String id){
        super("input", "");
        this.id(id);
        this.addAttr("type","text");
        this.addAttr("placeholder",placeHolder);

    }

}
