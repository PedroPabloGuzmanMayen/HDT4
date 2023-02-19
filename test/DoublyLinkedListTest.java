import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

    @Test
    public void removeTest() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
        doublyLinkedList.addLast(1);
        doublyLinkedList.addLast(2);
        doublyLinkedList.addLast(3);
        assertEquals(2, doublyLinkedList.remove(1));
    }

    @Test
    public void addTest() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
        doublyLinkedList.addLast(1);
        doublyLinkedList.addLast(2);
        assertEquals(2, doublyLinkedList.get(doublyLinkedList.size() - 1));
    }

    @Test
    public void isEmptyTest() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
        assertTrue(doublyLinkedList.isEmpty());
    }
}
