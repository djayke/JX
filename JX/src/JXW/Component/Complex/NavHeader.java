package JXW.Component.Complex;

import JXW.Component.Basic.Button;
import JXW.Component.Basic.Label;
import JXW.Component.Basic.Nav;
import JXW.Component.Basic.Title;
import JXW.Component.Container.Panel;

public class NavHeader extends Panel {
    public NavHeader() {
        super();
        this.addClass("pos-f-t");

        Panel header = new Panel();
        header.addClass("collapse");
        header.id("navbarToggleExternalContent");

        // upper hidden part
        Panel content = new Panel();
        content.addClass("bg-dark p-4");

        Title t = Title.createTitle(Title.Type.SMALL, "Collapse text");
        t.addClass("text-white");

        Label span = new Label("toggleable via nav bar");
        span.addClass("text-muted");

        content.addComponent(t);
        content.addComponent(span);
        header.addComp(content);
        this.addComp(header);

        //
        Nav nav = new Nav();
        nav.addClass("navbar navbar-dark bg-dark");

        Button b = new Button("");
        b.addClass("navbar-toggler");
        b.addAttr("data-toggle", "collapse");
        b.addAttr("data-target", "#navbarToggleExternalContent");
        b.addAttr("aria-controls", "navbarToggleExternalContent");
        b.addAttr("aria-expanded", "false");
        b.addAttr("aria-label", "Toggle navigation");
        b.addAttr("type", "button");

        Panel span2 = new Panel();
        span2.addClass("navbar-toggler-icon");

        nav.addComponent(b);
        nav.addComponent(span2);
        this.addComp(nav);

    }
}

/**
 <div class="collapse" id="navbarToggleExternalContent">
    <div class="bg-dark p-4">
    <h4 class="text-white">Collapsed content</h4>
    <span class="text-muted">Toggleable via the navbar brand.</span>
    </div>
 </div>
 <nav class="navbar navbar-dark bg-dark">
     <button class="navbar-toggler" type="button" data-toggle="collapse" ="" =""="false" aria-label="Toggle navigation">
     <span class="navbar-toggler-icon"></span>
     </button>
 </nav>

 */