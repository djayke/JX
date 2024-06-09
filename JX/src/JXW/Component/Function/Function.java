package JXW.Component.Function;

import JXW.Component.Comp;

//TODO: micro stmt and from xml or txt file with ajax load and lambda expresion
public class Function extends Comp {

    private String name;
    private String[] args;
    private String code;

    public Function(String _name, String _code) {
        super("script", "");
        this.name = _name;
        this.code = _code;
        generateFunction();
    }

    public Function(String _name, String[] _args, String _code) {
        super("script", "");
        this.name = _name;
        this.code = _code;
        this.args = _args;
        generateFunction();
    }

    private String getArgString(){
        StringBuilder argstr= new StringBuilder();
        for(String a:this.args)
            argstr.append(a.concat(","));
        return argstr.substring(0,argstr.length()-1);
    }

    private void generateFunction(){
        String func = "";

        if(this.args == null)
            func += "function " + this.name + "()";
        else
            func += "function " + this.name + "(" + getArgString() + ")" + "{ code }";

        func = func.replace("code", this.code);

        this.setContent(func);
    }

    public String funky(){
        return this.code;
    }
}
