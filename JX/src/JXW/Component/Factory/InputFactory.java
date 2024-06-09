package JXW.Component.Factory;

import JXW.Component.Comp;

//TODO BUILDER?
public class InputFactory {

    private static AbstractFactory getFactory(boolean isContainer){
        if(isContainer){
            return new BasicInputFactory();
        } else {
            return new ContainerFactory();
        }
    }

    public Comp getLayoutComp(String comp, boolean container) {
        AbstractFactory factory = InputFactory.getFactory(container);
        Comp c = factory.getComp(comp);
        return c;
    }
}
