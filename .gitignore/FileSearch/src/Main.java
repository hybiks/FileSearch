import java.io.File;

public class Main {

    public static void main(String[] args) {
        for (File file : new AbstractSeatchable().search("C:\\Users\\eokuncev\\Downloads", "csv")){
            System.out.println(file);
        }
    }
}
