package JXW.Component.Factory;

import JXW.Component.Comp;
import JXW.Component.Input.Base.*;

public class BasicInputFactory extends AbstractFactory{
    @Override
    Comp getComp(String compType) {
        switch(compType){
            case "checkBox"     -> {return new checkBox();}
            case "color"        -> {return new Color();}
            case "datePicker"   -> {return new DatePicker();}
            case "fileChooser"  -> {return new FileChooser();}
            case "Image"        -> {return new Image();}
            case "radio"        -> {return new radioButton();}
            case "textInput"    -> {return new TextInput();}
            default             -> {return null;}
        }
    }
}
