public class Engine {

    private static Engine handler = new Engine();
    private Engine(){}


    public static void newProject(String arg){
        Engine.handler.newProjectImpl(arg);
    }

    public static void run() {
        Engine.handler.runImpl();
    }

    public static void install(String arg) {
    }

    public static void build() {
    }

    public static void test() {
    }

    public static void deploy(String arg) {

    }


    private void newProjectImpl(String arg) {
        if(generateBaseDirectory(arg)){
            status(new Succes());
        }else{
            status(new Error());
        }
    }

    private boolean generateBaseDirectory(String _directoryName){
        //mkdir
        //create tree
        //create index.html
        //create main.js & site.js
        //create comp/page.jx
        //create java/classForAnnotations
        //create data?????
        //create configFile
        return false;
    }

    private void status(StateCommand cmd) {}
    private abstract class StateCommand { }
    private class Succes extends StateCommand { }
    private class Error extends StateCommand { }
}
