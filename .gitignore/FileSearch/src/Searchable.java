import java.io.File;
import java.util.List;

public interface Searchable {

    List search(String path, String ... constraints);

    File separate(File file, String ... constraints);
}
