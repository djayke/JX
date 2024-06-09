import Abstract.XML;
import JXW.Component.Basic.Button;
import JXW.Component.Container.Page;
import JXW.Component.Container.Panel;
import JXW.Component.Input.TextInput;


public class Main {
    public static void main(String[] args) {
        test();

        String funcClick = ""; //TODO WOULD BE COOL
        Test t = new Test("index");
        System.out.println(t.toString());
    }



    private static class Test extends Page{

        Panel content = new Panel();

        public Test(String name){
            super(name);
            button();
            textinput();
            this.setContentPanel(content);
        }

        void button()
        {
            Button c = new Button("test", "btnOk");
            c.addEvent("onclick", "func()");
            content.addComponent(c);
        }
        void textinput()
        {
            TextInput i = new TextInput("inputName");
            content.addComponent(i);
        }

    }

    private static void test() {
        XML p = XML.Factory.Get()
                .type("a")
                .text("This is going okay")
                .addAttribute("href", "#!")
                .build();

        XML body = XML.Factory.Get()
                .type("body")
                .addNode(p)
                .build();

        XML html = XML.Factory.Get()
                .type("html")
                .addNode(body)
                .build();

        System.out.println(html.toString());
    }

}