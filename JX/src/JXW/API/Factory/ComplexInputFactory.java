package JXW.API.Factory;

import JXW.Component.Comp;
import JXW.Component.Input.Complex.*;

public class ComplexInputFactory extends AbstractFactory {
    @Override
    Comp getComp(String compType) {
        switch(compType){
            case "checkBox"     -> {return new CheckBoxSection();}
            case "color"        -> {return new ColorSection();}
            case "datePicker"   -> {return new DatePickerSection();}
            case "fileChooser"  -> {return new FileChooserSection();}
            case "Image"        -> {return new ImageSection();}
            case "radio"        -> {return new RadioButtonSection();}
            case "textInput"    -> {return new TextInputSection();}
            default             -> {return null;}
        }
    }
}
