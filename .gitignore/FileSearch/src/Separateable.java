import java.io.File;
import java.util.List;

public interface Separateable {

    File separate(File file, String ... constraints);
}
