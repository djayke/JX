import JXW.Component.Basic.Button;
import JXW.Component.Basic.Link;
import JXW.Component.Comp;
import JXW.Component.Complex.*;
import JXW.Component.Container.Page;
import JXW.Component.Container.Panel;
import JXW.Component.Container.Url;
import JXW.Component.Function.Event.ActionEvent;
import JXW.Component.Input.FileChooser;

import java.io.FileNotFoundException;



public class Test {
    public static void main(String[] args) throws FileNotFoundException {


        // read myapp html
        String index = "/home/jzk/Bureau/JXW/myapp/index.html";
        String cacheIndex = Util.readFromFile(index);

        // replace comp

        // My page render content
        MaPageCustom page = new MaPageCustom("index");
        String updatedIndex = cacheIndex.replace("@index", page.render());

        // privacy
        map privacy = new map();
        updatedIndex = updatedIndex.replace("@privacy", privacy.render());

        // Write new index
        Util.WriteToFile("/home/jzk/Bureau/JXW/myapp/index2.html", updatedIndex);

    }


    /**
     * Petite page to avec 2 -3 component
     */
    private static class MaPageCustom extends Page {
        Panel content = new Panel();

        public MaPageCustom(String name){
            super(name);

            // set navbar
            NavBar manav = new NavBar();
            manav.addLink("#!", "Home");
            manav.addLink("#!", "privacy");
            manav.addSearch("Search", "find!");
            content.addComponent(manav);


            //Dropdown
            DropDown dd = new DropDown("dropdownMenuButton");
            content.addComponent(dd);
            dd.addItem(new Link("Action1", "#"));
            dd.addItem(new Link("Action2", "#"));
            dd.addItem(new Link("Action3", "#"));
            dd.addItem(new Link("Action4", "#"));


            //Card
            Card test = new Card();
            content.addComp(test);


            // add login page
            Login login = new Login();
            content.addComponent(login);

            this.setContentPanel(content);
            this.show();
        }

    }

    private static class map extends Page{
        Panel content = new Panel();

        public map(){
            super("privacy");

            content.addComp(new Button("page2ok"));

            this.setContentPanel(content);
            this.hide();
        }

    }


}