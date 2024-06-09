
public class Main {
    public static void main(String[] args) {

        String opt = args[0];
        String optArgs = args[1];

        switch (opt) {
            case "new"      -> Engine.newProject(optArgs);
            case "run"      -> Engine.run();
            case "install"  -> Engine.install(optArgs);
            case "build"    -> Engine.build();
            case "test"     -> Engine.test();
            case "deploy"   -> Engine.deploy(optArgs);
        }

        System.out.println(opt);
        System.out.println(optArgs);
    }
}