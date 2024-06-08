package Abstract;

import java.util.ArrayList;
import java.util.List;

public class HTML extends XML {

    public HTML(String type, String text) {
        super(type, text);
    }

    /**
     * Return type of component
     * @return
     */
    public String type(){
        return this.tag;
    }

    /**
     * Return innerHTML
     * @return
     */
    public String text(){
        return this.content;
    }

    /**
     * Change the inner value of the tag
     * @param _text
     */
    public void text(String _text){
        this.content = _text;
    }

    /**
     * Set id of component
     * @param id
     */
    public void id(String id){
        this.addAttribute("id", id);
    }

    /**
     * Return value associated to component's id
     * @return id
     */
    public String id(){
        if(this.containsAttribute("id"))
            return this.getAttribute("id").getFirst();
        return "";
    }

    /**
     * Add a attribute to the component's
     * @param _k attribute name
     * @param _v attribute value
     */
    public void addAttr(String _k, String _v){
        this.addAttribute(_k,_v);
    }

    /**
     * return attribute value
     * @param _k
     * @return
     */
    public String getAttributeValue(String _k){
        return this.getAttributeStringValue(_k);
    }

    /**
     * Remove a attribute from the component's attribute
     * @param attribute
     */
    public void removeAttribute(String attribute){
        this.removeAttr(attribute);
    }

    /**
     * Add a class to the component
     * @param _class
     */
    public void addClass(String _class){
        this.addAttribute("class", _class);
    }

    /**
     * Return class associated to the component's
     * @return
     */
    public String getClasse(){
        return this.getAttributeStringValue("class");
    }

    /**
     * Remove a single value of the class attribute
     * @param value
     */
    public void removeClass(String value){
        this.removeAttribute("class", value);
    }

    /**
     * Add event to the component
     * @param _event event to listen to
     * @param _bind function or code to bind on event
     */
    public void addEvent(String _event, String _bind){
        this.addAttribute(_event, _bind);
    }

    /**
     * Add a Abstract.HTML component as a child to the component
     * @param _component
     */
    public void addComponent(HTML _component){
        this.addNode(_component);
    }

    /**
     * Return list of child component if they are HTML component
     * @return
     */
    public List<HTML> getChildNode(){
        List<HTML> cast = new ArrayList<>();
        for(XML tag:this.getNodes()){
            if(!(tag instanceof HTML)){
                return null;
            }else{
                cast.add((HTML)tag);
            }
        }

        return cast;
    }

    public void remove(){
        this.removeNode(this);
    }

    /**
     * Remove node with id as children
     * @param _id
     */
    public void removeNodeWithId(String _id){
        this.removeNodeAttribute("id", _id);
    }

}
