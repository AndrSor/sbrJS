import java.io.IOException;

public class BrowsPageExeption extends IOException {
    public BrowsPageExeption(Throwable cause) {
        super("An error occurred during url reading process.", cause);
    }
}
