package JXW.Component.Complex;

import JXW.Component.Basic.Button;
import JXW.Component.Basic.Title;
import JXW.Component.Container.Form;

public class Login extends Form {

        public Login(){
            // Title
            Title t = Title.createTitle(Title.Type.MEDIUM, "Login");
            t.addClass("mb-3");

            // Button
            Button signin = new Button("Sign in");
            signin.addClass("btn btn-primary");
            signin.id("btnLogin");
            signin.id("signin");

            this.addComponent(t);
            this.addComponent(new Input("Username"));
            this.addComponent(new Input("Password"));
            this.addComponent(signin);
            this.addClass("form-login");
        }


}
