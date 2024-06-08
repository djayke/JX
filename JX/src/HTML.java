import Abstract.XML;

import java.util.ArrayList;
import java.util.List;

public class HTML extends XML {

    private List<Event> event  = new ArrayList<>();

    public HTML(String type, String text) {
        super(type, text);
    }

    public void render(){}



    public void id(String id){
        this.addAttribute("id", id);
    }
    public void addEvent(String _event, String _bind){
        Event e = new Event(_event, _bind);
        this.event.add(e);
        this.addAttribute(_event, _bind);
    }
    public void addClass(String _class){
        this.addAttribute("class", _class);
    }
    public void addStyle(String _s, String _v){
        this.addAttribute(_s,_v);
    }


    public String type(){
        return this.tag;
    }
    public String text(){
        return this.content;
    }
    public String id(){
        if(this.containsAttribute("id"))
            return this.getAttribute("id").getFirst();
        return "";
    }
    public String getClasse(){
        return this.getAttributeStringValue("class");
    }


    public void removeClass(String value){
        this.removeAttribute("class", value);
    }
    public void removeAttribute(String attribute){
        this.removeAttr(attribute);
    }


    /*TODO:ADD METHOD
    public void getEvents(){}
    public void getEvent(String eventName){}
    public void deleteEvent(String eventName){}
    */



}
