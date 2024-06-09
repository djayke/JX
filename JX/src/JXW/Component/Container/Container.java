package JXW.Component.Container;

import Abstract.HTML;
import JXW.Component.Comp;

import java.util.List;

public class Container extends Comp {
    public Container(String type, String text) {
        super(type, text);
    }

    public void addComp(Comp c){
        this.addComponent(c);
    }

    public void addComponents(List<Comp> lst){
        lst.forEach(this::addComp);
    }

    public void mergeWith(Comp container){
        List<HTML> toBeMerge =  container.getChildNode();
        toBeMerge.forEach(HTML::remove);
        for (HTML x : toBeMerge) {
            this.addComponent(x);
        }
    }

}
