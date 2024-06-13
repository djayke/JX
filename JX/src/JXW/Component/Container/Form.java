package JXW.Component.Container;


public class Form extends Container {

    Url url;

    public Form()
    {
        super("form", "");
    }

    private void addAction(String _action)
    {
        this.addAttr("action", _action);
    }

    public void action(Url url)
    {
        this.url=url;
    }

}
