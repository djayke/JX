package JXW.Component;

import JXW.Event.ActionEvent;
import JXW.Event.FocusEvent;
import JXW.Event.MouseEvent;

public class AbstractInput extends Comp implements FocusEvent, MouseEvent, ActionEvent {
    public AbstractInput(String text) {
        super("button", text);
    }

    @Override
    public void render() {
        System.out.println(this.toString());
    }


    @Override
    public void blur(String bind) {
        this.comp.addEvent("onblur", bind);
    }

    @Override
    public void focus(String bind) {
        this.comp.addEvent("onfocus", bind);
    }

    @Override
    public void click(String bind) {
        this.comp.addEvent("onclick", bind);
    }

    @Override
    public void contextMenu(String bind) {
        this.comp.addEvent("oncontextmenu", bind);
    }

    @Override
    public void mouseout(String bind) {
        this.comp.addEvent("onmouseout", bind);
    }

    @Override
    public void mouseover(String bind) {
        this.comp.addEvent("onmouseover", bind);
    }

    @Override
    public void mouseenter(String bind) {
        this.comp.addEvent("onmouseenter", bind);
    }

    @Override
    public void mouseleave(String bind) {
        this.comp.addEvent("onmouseleave", bind);
    }

    @Override
    public void mousemove(String bind) {
        this.comp.addEvent("onmousemove", bind);
    }

    @Override
    public void mousedown(String bind) {
        this.comp.addEvent("onmousedown", bind);
    }

    @Override
    public void mouseup(String bind) {
        this.comp.addEvent("onmouseup", bind);
    }

    @Override
    public void oninput(String bind) {
        this.comp.addEvent("oninput", bind);
    }

    @Override
    public void select(String bind) {
        this.comp.addEvent("oninput", bind);
    }

    @Override
    public void change(String bind) {
        this.comp.addEvent("onchange", bind);
    }
}
