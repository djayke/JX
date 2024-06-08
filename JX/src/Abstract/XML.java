package Abstract;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class XML {

    protected String tag = "";
    protected String content = "";
    protected HashMap<String, Attribute> attribute = new HashMap<>();
    private List<XML> children = new ArrayList<>();
    private XML parent;

    private final String GENERIC_STRING = "<? @>children content</?>";


    /**
     * Constructeur par default
     */
    public XML(){}

    /**
     * Constructor
     * @param _tag <tag></tag>
     */
    public XML(String _tag){
        this.tag = _tag;
        this.content = "";
    }

    /**
     * Constructor
     * @param _tag <tag></tag>
     * @param _content <tag>content</tag>
     */
    public XML(String _tag, String _content){
        this.tag = _tag;
        this.content = _content;
    }


    /* =======================================================
                    Section content & tag
    ========================================================= */
    protected void setContent(String _content){
        this.content = _content;
    }


    /* =======================================================
                    Section attribute
    ========================================================= */
    protected void addAttribute(String _attr, String _value){
        if(this.attribute.containsKey(_attr))
            this.attribute.get(_attr).addValue(_value);
        else
            this.attribute.put(_attr, new Attribute(_attr, _value));
    }

    protected void addAttribute(Attribute _attr){
        if(this.attribute.containsKey(_attr.getAttributeName()))
            this.attribute.get(_attr.getAttributeName()).addValue(_attr.getAttributeValue());

        this.attribute.put(_attr.getAttributeName(), _attr);
    }

    protected List<Attribute> getAttributeAsList(){
        return new ArrayList<>(attribute.values());
    }

    protected String getAttributeStringValue(String attr){
        return attribute.get(attr).getAttributeValueAsString();
    }

    protected List<String> getAttribute(String attr){
        return attribute.get(attr).getAttributeValue();
    }

    protected boolean containsAttribute(String attr){
        return attribute.containsKey(attr);
    }

    protected boolean containsAttributeWithValue(String attr,String value){
        if(containsAttribute(attr))
            return attribute.get(attr).containsValue(value);
        return false;
    }

    protected void removeAttribute(String Key, String Value){
        if(containsAttributeWithValue(Key, Value)){
            attribute.get(Key).removeValue(Value);
        }
    }

    protected void removeAttr(String attribute) {
        if(containsAttribute(attribute)){
            this.attribute.remove(attribute);
        }
    }

    /* =======================================================
                    Section child node
    ========================================================= */
    protected void addNode(XML node){
        this.children.add(node);
        node.parent = this;
    }

    protected void removeNode(XML node){
        this.children.removeIf(n -> n.equals(node));
        node.parent = null;
    }

    protected void removeNodeAttribute(String key, String value) {
        this.children.removeIf(n->n.containsAttributeWithValue(key,value));
        //TODO:Remove parent
    }

    protected List<XML> getNodes(){
        return this.children;
    }

    /* =======================================================
                    Section override
    ========================================================= */
    private String getAttributeAsString(){
        StringBuilder ctx= new StringBuilder();
        for (var entry : this.attribute.entrySet()) {
            ctx.append(entry.getValue().toString());
            ctx.append(" ");
        }
        return ctx.toString();
    }

    private String getChildrenString(){
        StringBuilder ctx= new StringBuilder();
        for(XML c:children) {
            ctx.append(c.toString());
            ctx.append("\n");
        }
        return ctx.toString();
    }

    @Override
    public String toString(){
        return GENERIC_STRING.replace("?", this.tag)
                    .replace("content", this.content)
                    .replace("children", getChildrenString())
                    .replace("@", getAttributeAsString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XML xml = (XML) o;
        return Objects.equals(tag, xml.tag) && Objects.equals(content, xml.content) && Objects.equals(children, xml.children) && Objects.equals(attribute, xml.attribute) && Objects.equals(GENERIC_STRING, xml.GENERIC_STRING);
    }



    /** ***********************************************************
     *              Handle Abstract.XML node Creation
     **************************************************************/
    public static class Factory {
        private final XML render;
        private static Factory instance = null;

        public static Factory Get(){
            Factory.instance=new Factory();
            return Factory.instance;
        }

        private Factory(){
            render = new XML();
        }

        public XML build(){
            return render;
        }

        public Factory type(String _type){
            render.tag = _type;
            return this;
        }

        public Factory text(String _text){
            render.content = _text;
            return this;
        }

        public Factory addAttribute(String _name, String _value){
            render.addAttribute(_name, _value);
            return this;
        }

        public Factory addNode(XML _node){
            render.addNode(_node);
            return this;
        }


    }

}

