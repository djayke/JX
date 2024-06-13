package JXW.Component.DataBinding;

import JXW.Component.Comp;

import java.util.Arrays;

public class List extends Comp {
    public List() {
        super("ul","");
    }
    /**
     * How to use ...
     * use to separate text
     * @param item
     */
    public List(String item) {
        super("ul","");
        Arrays.stream(item.split(",")).toList().forEach(i->this.addComponent(new Item(i)));
    }

    /**
     * Add Component
     * @param items
     */
    public List(Comp[] items){
        super("ul", "");
        Arrays.stream(items).toList().forEach(i->this.addComponent(new Item(i)));
    }

    public void AddComponentToList(Comp i){
        this.addComponent(new Item(i));
    }

    private class Item extends Comp{
        public Item(String text) {
            super("li", text);
        }

        public Item(Comp i) {
            super("li", "");
            this.addComponent(i);
        }
    }
}
