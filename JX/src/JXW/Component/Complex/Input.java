package JXW.Component.Complex;

import JXW.Component.Basic.Label;
import JXW.Component.Container.Panel;
import JXW.Component.Input.TextInput;

public class Input extends Panel {

    public Input(String label){
        this.addClass("form-group row");

        Label labelinput = new Label(label);
        labelinput.addClass("form-label");

        TextInput txtinput = new TextInput("Password");
        txtinput.id(label);
        txtinput.addClass("form-control");

        this.addComponent(labelinput);
        this.addComponent(txtinput);
    }

}
