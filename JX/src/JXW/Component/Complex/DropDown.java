package JXW.Component.Complex;

import JXW.Component.Basic.Button;
import JXW.Component.Basic.Link;
import JXW.Component.Comp;
import JXW.Component.Container.Panel;

public class DropDown extends Panel {

    private Panel menu;

    public DropDown(String id){
        this.addClass("dropdown");

        Button b = new Button("DropDown");
        b.addClass("btn btn-secondary dropdown-toggle");
        b.id(id);
        b.addAttr("data-toggle", "dropdown");
        b.addAttr("aria-haspopup", "true");
        b.addAttr("aria-expanded", "false");
        b.addAttr("type", "button");
        this.addComponent(b);

        menu = new Panel();
        menu.addClass("dropdown-menu");
        menu.addAttr("aria-labelledby", id);
        this.addComponent(menu);

    }

    public void addItem(Comp c){
        c.addClass("dropdown-item");
        menu.addComponent(c);
    }

}

