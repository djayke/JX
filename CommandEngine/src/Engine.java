import java.io.File;

public class Engine {

    private static Engine handler = new Engine();
    private Engine(){}


    public static void newProject(String arg){
        System.out.println("creating a new project...");
        Engine.handler.newProjectImpl(arg);
    }

    public static void run() {
        System.out.println("run project...");
        Engine.build();
    }

    public static void install(String arg) {
        System.out.println("installing dependencies...");
    }

    public static void build() {
        System.out.println("building projects...");
        Engine.handler.buildImpl();
    }

    public static void test() {
        System.out.println("testing...");
    }

    public static void deploy(String arg) {
        System.out.println("deploy app...");
    }

    public static void help() {
        System.out.println("help ?");
        System.out.println("Usage: jxw [new -projectName] [run] [install -lib] [build] [test] [deploy -ouputName] [help] ");
    }


    private void buildImpl(){
        // read every classFile in comp
        File folderComponent = new File("./comp/");

        // for each file generate html
        // fetch in index
    }

    private void newProjectImpl(String arg) {
        if(generateBaseDirectory(arg)){
            status("Success...");
        }else{
            status("Error folder already exist...");
        }
    }

    private void status(String msg) {
            System.out.println(msg);
    }

    private boolean generateBaseDirectory(String _directoryName){
        //Create directory project if folder not exist
        File dir = new File("./" + _directoryName);
        if (!dir.exists()){
            dir.mkdirs();
        } else {
            return false;
        }

        //Create components folder
        File folderComponent = new File("./" + _directoryName + "/comp/");
        folderComponent.mkdirs();

        //create index.html
        String index = dir + "/index.html";
        Util.WriteToFile(index, Util.ContentIndex());

        //create main.js
        String mainjs = dir + "/main.js";
        Util.WriteToFile(mainjs, "");

        //create site.js
        String sitejs = dir + "/site.js";
        Util.WriteToFile(sitejs, "");

        //create style.css
        String style = dir + "/style.css";
        Util.WriteToFile(style, "");

        //create configFile
        String config = dir + "/config";
        Util.WriteToFile(config, "");

        return true;
    }
    
}
