package tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoTest {
    @Test
    public void todoTest_printTask() {
        assertEquals("[T][ ] task1", new Todo("task1").toString());
    }

    @Test
    public void todoTest_parseTask() {
        Task task = new Todo("");
        assertEquals("T #   #  # ", task.parseToFile());
    }
}
