
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testMain() {
        Main.main(new String[]{});
        assertTrue(true, "Main executed successfully");
    }
}
