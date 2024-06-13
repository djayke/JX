package JXW.Component.Input;

import JXW.Component.Comp;

public class Search extends AbstractInput {

    public Search(){
        super("search");
    }

    public Search(String placeholder) {
        super("search");
        this.addAttribute("placeholder", placeholder);
    }

}
