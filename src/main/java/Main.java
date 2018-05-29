import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {

        Logger test = LoggerFactory.getLogger("My app");

        test.info("info");
        test.debug("debug");
        test.warn("warn");
        test.error("error");
    }
}
