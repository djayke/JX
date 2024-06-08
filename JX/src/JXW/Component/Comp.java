package JXW.Component;

import Abstract.HTML;
import JXW.Event.Component;

public abstract class Comp implements Component {

    protected HTML comp;
    private boolean enable = true;

    public Comp(String type, String text) {
        this.comp=new HTML(type,text);
        enable=true;
    }

    public void id(String str){
        comp.id(str);
    }

    @Override
    public abstract void render();

    @Override
    public boolean isVisible() {
        return enable;
    }

    @Override
    public void show() {
        enable=false;
    }

    @Override
    public void hide() {
        enable=true;
    }
}
