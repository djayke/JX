package JXW.Component.DataBinding;

import JXW.Component.Comp;

import java.util.Arrays;
import java.util.List;

public class MenuDrop extends Comp {
    public MenuDrop(String id) {
        super("select", id);
    }

    public MenuDrop() {
        super("select", "");
    }

    public MenuDrop(String[] item) {
        super("select", "");
        Arrays.stream(item).toList().forEach(i->this.addComponent(addOption(i)));
    }

    public MenuDrop(List<Comp> comp) {
        super("select", "");
        comp.forEach(i->this.addComponent(addOption(i)));
    }

    public Option addOption(String value){
        return new Option(value);
    }

    public Option addOption(Comp comp){
        return new Option(comp,comp.id());
    }

    public class Option extends Comp{
        public Option(String text) {
            super("option", text);
            this.addAttr("value", text);
        }
        public Option(Comp comp, String bind){
            super("option", "");
            this.addAttr("value", bind);
            this.addComponent(comp);
        }
    }

}
