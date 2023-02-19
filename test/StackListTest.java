import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StackListTest {
    @Test
    public void LinkedListPeekAndPushTest() {
        StackList<Integer> stackList = new StackList<Integer>("Linked");
        stackList.push(5);
        stackList.push(8);
        assertEquals(8, stackList.peek());
    }

    @Test
    public void LinkedListPopTest() {
        StackList<Integer> stackList = new StackList<Integer>("Linked");
        stackList.push(5);
        assertEquals(5, stackList.pop());
    }

    @Test
    public void LinkedListSizeTest() {
        StackList<Integer> stackList = new StackList<Integer>("Linked");
        stackList.push(5);
        stackList.push(6);
        stackList.push(10);
        stackList.pop();
        assertEquals(2, stackList.size());
    }

    @Test
    public void DoublyLinkedListPeekAndPushTest() {
        StackList<Integer> stackList = new StackList<Integer>("DoublyLinked");
        stackList.push(5);
        stackList.push(8);
        assertEquals(8, stackList.peek());
    }

    @Test
    public void DoublyLinkedListPopTest() {
        StackList<Integer> stackList = new StackList<Integer>("DoublyLinked");
        stackList.push(5);
        assertEquals(5, stackList.pop());
    }

    @Test
    public void DoublyLinkedListSizeTest() {
        StackList<Integer> stackList = new StackList<Integer>("DoublyLinked");
        stackList.push(5);
        stackList.push(6);
        stackList.push(10);
        stackList.pop();
        assertEquals(2, stackList.size());
    }

}
