package DataSource;

import java.util.function.Function;

public enum FileFormat {
    COMMA_SEPARATED(s -> s.split(",")), SPACE_SEPARATED(s -> s.split("\\s+"));

    public Function<String, String[]> split;

    private FileFormat(Function<String, String[]> split) {
        this.split = split;
    }
}
