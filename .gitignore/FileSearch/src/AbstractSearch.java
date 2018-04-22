import java.io.File;
import java.util.List;

public abstract class AbstractSearch implements Searchable {
    @Override
    public abstract List search(String path, String... constraints);

    @Override
    public abstract File separate(File file, String... constraints);
}
