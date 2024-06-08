package JXW.Component;

import Abstract.HTML;
import JXW.Event.Component;

import java.util.ArrayList;
import java.util.List;

public abstract class Comp extends HTML implements Component {

    private boolean enable = true;

    public Comp(String type, String text) {
        super(type,text);
        enable=true;
    }

    @Override
    public String render(){
        return this.toString();
    }

    @Override
    public boolean isVisible() {
        return enable;
    }

    @Override
    public void show() {
        enable=false;
        this.addAttribute("display", "block;");
    }

    @Override
    public void hide() {
        enable=true;
        this.addAttribute("display", "none;");
    }

}
