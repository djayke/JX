package JXW.Component.Container;

public class Page extends Container {

    private Route url;

    public Page(String name) {
        super("div", "");
        this.id(name);
        this.hide();
    }

    public void setContentPanel(Panel pane) {
        this.addComponent(pane);
    }

    public void route(String url){
        this.url = new Route();
    }

    /**
     * Class javascript
     */
    private class Route {
    }


    /**
     * const url = new URL(
     *   "https://developer.mozilla.org/en-US/docs/Web/API/URL/href#Examples",
     * );
     * console.log(url.hash); // Logs: '#Examples'
     */
}
