import Abstract.XML;
import JXW.Component.Basic.Button;
import JXW.Component.Container.Panel;
import JXW.Component.Input.TextInput;

public class Main {
    public static void main(String[] args) {
        test();

        Button c = new Button("test","btnOk");
        TextInput i = new TextInput("placeHolder","inputName");
        Panel pane = new Panel();
        pane.addComponent(c);
        pane.addComponent(i);


        System.out.println(pane);;

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