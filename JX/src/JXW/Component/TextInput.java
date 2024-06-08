package JXW.Component;

public class TextInput extends Comp {
    public TextInput() {
        super("input", "");
        this.addAttr("type","text");
    }

    public TextInput(String id){
        super("input", "aaa");
        this.id(id);
        this.addAttr("type","text");

    }

}
