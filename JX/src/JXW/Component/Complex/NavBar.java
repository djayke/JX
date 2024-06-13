package JXW.Component.Complex;

import JXW.Component.Basic.Button;
import JXW.Component.Basic.Link;
import JXW.Component.Comp;
import JXW.Component.Container.Form;
import JXW.Component.Container.Panel;
import JXW.Component.DataBinding.List;
import JXW.Component.Input.Search;

public class NavBar extends Comp {
    private Panel right;
    private List lstLink;

    public NavBar() {
        super("nav", "");
        this.addClass("navbar navbar-expand-lg navbar-dark bg-dark");

        Panel content = new Panel();
        content.addClass("collapse navbar-collapse");
        content.id("id");

        lstLink = new List();
        lstLink.addClass("navbar-nav mr-auto");

        content.addComponent(lstLink);
        this.addComponent(content);

        right = new Panel();
        right.addClass("navbar-text");
        this.addComponent(right);
    }

    public void addLink(String url, String content) {
        Link b = new Link(content, url);
        b.addClass("nav-link");
        lstLink.AddComponentToList(b);
    }

    public void addItemRight(Comp c){
        right.addComponent(c);
    }

    public void addSearch(String placeholder, String button) {
        Form wrapper = new Form();
        wrapper.addClass("form-inline");
        Search search = new Search(placeholder);
        search.addClass("form-control mr-sm-2");
        Button searchBtn = new Button(button);
        searchBtn.addClass("btn btn-outline-success my-2 my-sm-0");
        wrapper.addComp(search);
        wrapper.addComp(searchBtn);
        right.addComp(wrapper);
    }
}
