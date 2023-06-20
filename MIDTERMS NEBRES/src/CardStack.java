import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

public class CardStack implements Iterable<Card> {
    private List<Card> stack;

    public CardStack() {
        stack = new ArrayList<>();
    }

    public void push(Card card) {
        stack.add(card);
    }

    public Card pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        Card card = stack.get(lastIndex);
        stack.remove(lastIndex);
        return card;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    @Override
    public Iterator<Card> iterator() {
        return stack.iterator();
    }
}