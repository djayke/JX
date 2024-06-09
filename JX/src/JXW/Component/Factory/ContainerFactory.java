package JXW.Component.Factory;

import JXW.Component.Comp;
import JXW.Component.Container.Form;
import JXW.Component.Container.Panel;

public class ContainerFactory extends AbstractFactory {
    @Override
    Comp getComp(String compType) {
        switch(compType){
            case "form"         -> {return new Form();}
            case "panel"        -> {return new Panel();}
            default             -> {return null;}
        }
    }
}
