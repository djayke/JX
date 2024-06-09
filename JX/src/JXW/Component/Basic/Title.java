package JXW.Component.Basic;

import JXW.Component.Comp;



public class Title extends Comp {
    public enum Type {
        HEADER,
        NORMAL,
        MEDIUM,
        SMALL
    }

    public static Title createTitle(Type t, String text){
        switch(t){
            case HEADER -> {return new Title("h1", text);}
            case NORMAL -> {return new Title("h2", text);}
            case MEDIUM -> {return new Title("h3", text);}
            case SMALL -> {return new Title("h4", text);}
            default -> {return new Title("p", text);}
        }
    }

    private Title(String type, String text) {
        super(type, text);
    }

}
