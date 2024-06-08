public class Event {

    private String method;
    private Bind call;

    public enum Bind { function, code }

    public Event(String method, String _bind){
        this.method=method;
        if(_bind.contains("()"))
            call = Bind.function;
        else
            call = Bind.code;
    }

    public String toString(){
        return method + "=" + call;
    }

}
