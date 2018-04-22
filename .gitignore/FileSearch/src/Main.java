import java.io.File;

public class Main {

    public static void main(String[] args) {
        String fileType;

        for (String arg : args) {
            if (arg.startsWith("-")){
                fileType = arg.substring(arg.indexOf("-"));
            } else {
                for (File file : new Search().search(arg, new String[]{"txt"})){
                    System.out.println(file);
                }
            }
        }

        double usedBytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(Math.round(usedBytes / 1048576) + " MB");
    }
}
