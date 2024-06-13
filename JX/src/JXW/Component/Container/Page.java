package JXW.Component.Container;

public class Page extends Container {

    public Page() {
        super("div");
        this.hide();
    }

    public Page(String name) {
        super("div");
        this.id(name);
        this.hide();
    }

    public void setContentPanel(Panel pane) {
        this.addComponent(pane);
    }

}
