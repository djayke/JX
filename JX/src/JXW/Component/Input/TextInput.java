package JXW.Component.Input;

public class TextInput extends AbstractInput {

    public TextInput() {
        super("input");
    }

    public TextInput(String placeholder) {
        super("input");
        this.addAttribute("placeholder", placeholder);
    }
}
