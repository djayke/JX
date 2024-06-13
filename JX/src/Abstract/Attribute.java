package Abstract;

import java.util.ArrayList;
import java.util.List;

public class Attribute {
    private final String attr;
    private List<String> value = new ArrayList<>();

    public Attribute(String _attr, String _value){
        this.attr = _attr;
        this.value.add(_value);
    }

    public String getAttributeName(){
        return attr;
    }

    public List<String> getAttributeValue(){
        return value;
    }

    public String getAttributeValueAsString(){
        StringBuilder v= new StringBuilder("\"");
        for(String val:value){
            v.append(val).append(" ");
        }
        v.deleteCharAt(v.length() - 1);
        v.append("\"");
        return v.toString();
    }

    public void addValue(String _value){
        value.add(_value);
    }

    public void addValue(List<String> attributeValue) {
        value.addAll(attributeValue);
    }

    public boolean containsValue(String value) {
        for(String v:this.value)
            if(v.equals(value))
                return true;
        return false;
    }

    public void removeValue(String value) {
        for(String s:this.value){
            if(s.equals(value))
                this.value.remove(s);
        }
    }

    public String toString(){
        return this.attr + "=" + getAttributeValueAsString();
    }

    public boolean equals(Attribute o){
        if(!this.attr.equals(o.attr))
            return false;

        if(value.size() != o.value.size())
            return false;

        for(String v:value){
            boolean found = false;
            for(String o2:o.value){
                if (o2.equals(v)) {
                    found = true;
                    break;
                }
            }
            if(!found)
                return false;
        }

        return true;
    }


}
