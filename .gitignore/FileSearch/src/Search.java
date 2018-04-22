import java.io.File;
import java.util.*;

public class Search extends AbstractSearch {

    @Override
    public List<File> search(String path, String[] constraints) {
        List<File> fileList = new ArrayList<>();
        File file = new File(path);
        Queue<File> queue = new ArrayDeque<>();

        queue.add(file);


        while (queue.size() > 0){
            file = queue.poll();

            if (file.isDirectory()){
                fileList.add(file);
                queue.addAll(Arrays.asList(file.listFiles()));
            }else {
                if (constraints == null || constraints.length == 0 || separate(file, constraints) != null) {
                    fileList.add(file);
                }
            }
        }

        return fileList;
    }

    @Override
    public File separate(File file, String[] constraints) {
        for (String constrain : constraints){
            if (file.getName().endsWith("." + constrain)){
                return null;
            }
        }

        return file;
    }
}
