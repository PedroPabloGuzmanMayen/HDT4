import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void removeValueTest() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertEquals(2, linkedList.remove(1));
    }

    @Test
    public void removeSizeTest() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++)
            linkedList.add(i + 1);
        linkedList.remove(0);
        linkedList.remove(5);
        assertEquals(8, linkedList.size());
    }

    @Test
    public void getTest() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertEquals(2, linkedList.get(1));
    }
}
