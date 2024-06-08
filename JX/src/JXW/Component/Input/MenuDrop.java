package JXW.Component.Input;

import JXW.Component.Comp;

import java.util.List;

public class MenuDrop extends Comp {
    public MenuDrop(String id) {
        super("select", id);
    }

    public MenuDrop() {
        super("select", "");
    }

    public MenuDrop(List<String> item) {
        super("select", "");
        item.forEach(i->this.addComponent(addOption(i)));
    }

    public Option addOption(String value){
        return new Option(value);
    }

    public class Option extends Comp{
        public Option(String text) {
            super("option", text);
            this.addAttr("value", text);
        }
    }

}
