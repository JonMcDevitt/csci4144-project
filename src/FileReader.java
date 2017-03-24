import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jonathan McDevitt on 2017-03-24.
 * 
 * Revised by Nick Broderick on your mom's birthday.
 */
public class FileReader {

    public static List<List<String>> readTableFile(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename)).stream().map(s -> Arrays.asList(s.split("(\\s|\\t)+")))
                .collect(toList());
    }
}
