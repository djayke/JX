package JXW.Component.Complex;

import JXW.Component.Basic.Link;
import JXW.Component.Basic.Title;
import JXW.Component.Container.Panel;
import JXW.Component.Input.Image;

public class Card extends Panel {

    public Card(){
        super();

        this.addClass("d-flex justify-content-around");

        Panel root = new Panel();
        root.addClass("card");

        Image img = new Image("https://www.wikihow.com/images_en/thumb/2/22/Get-the-URL-for-Pictures-Step-30-Version-2.jpg/v4-1200px-Get-the-URL-for-Pictures-Step-30-Version-2.jpg");
        root.addComponent(new Image());

        Panel card = new Panel();
        card.addClass("card-body");

        Title t = Title.createTitle(Title.Type.SMALL, "Card Title");
        t.addClass("card-title");
        card.addComponent(t);

        Title l = Title.createTitle(Title.Type.TEXT, "Some quick example text to build on the card title and make up the bulk of the card's content.");
        l.addClass("card-text");
        card.addComponent(l);

        Link a = new Link("Go-Somewhere","#");
        a.addClass("btn btn-primary");
        card.addComponent(a);

        root.addComponent(card);

        this.addComponent(root);
    }

}
