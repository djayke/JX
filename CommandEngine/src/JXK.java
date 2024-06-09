//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JXK {
    public static void main(String[] args) {

        if(args.length == 0)
            Engine.help();

        // Get arguments
        String opt = args[0];
        String optArgs = args[1];

        // Choose proper Action
        switch (opt) {
            case "new"      -> Engine.newProject(optArgs);
            case "run"      -> Engine.run();
            case "install"  -> Engine.install(optArgs);
            case "build"    -> Engine.build();
            case "test"     -> Engine.test();
            case "deploy"   -> Engine.deploy(optArgs);
            case "help"     -> Engine.help();
        }

    }
}