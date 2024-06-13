package JXW.Component.Basic;

import JXW.Component.Comp;
import JXW.Component.Function.Event.MouseEvent;

public class Button extends Comp implements MouseEvent {

    public Button(){
        super("button", "");
    }

    public Button(String text) {
        super("button", text);
    }

    public Button(String text, String id) {
        super("button", text);
        this.id(id);
    }

    @Override
    public void click() {
        
    }

    @Override
    public void contextMenu() {

    }

    @Override
    public void mouseout() {

    }

    @Override
    public void mouseover() {

    }

    @Override
    public void mouseenter() {

    }

    @Override
    public void mouseleave() {

    }

    @Override
    public void mousemove() {

    }

    @Override
    public void mousedown() {

    }

    @Override
    public void mouseup() {

    }
}
