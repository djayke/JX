import JXW.Component.Basic.Button;
import JXW.Component.Container.Page;
import JXW.Component.Container.Panel;
import JXW.Component.Function.Function;
import JXW.Component.Input.TextInput;


public class Test {
    public static void main(String[] args) {

        MaPageCustom t = new MaPageCustom("index");
        System.out.println(t.toString());
    }


    /**
     * Petite page to avec 2 -3 component
     */
    private static class MaPageCustom extends Page {

        Panel content = new Panel();

        public MaPageCustom(String name){
            super(name);
            button();
            textinput();
            this.setContentPanel(content);
        }

        Function functionClickButton(){
            Function funk = new Function("btnClick","alert(document.getElementById('inp').text());");
            return funk;
        }

        void button()
        {
            Button c = new Button("test", "btnOk");
            c.addEvent("onclick", functionClickButton().funky());
            content.addComponent(c);
        }
        void textinput()
        {
            TextInput i = new TextInput("inputName");
            i.id("inp");
            content.addComponent(i);
        }

    }


}