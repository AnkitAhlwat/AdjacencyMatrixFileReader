import java.util.ArrayList;

/**
 * The type Node.
 *
 * @author Ankit Ahlwat
 * @version 2023
 */
public class Node {
    private int object;
    private Node previous = null;
    private Node next = null;

    private final ArrayList<Node> nextNodesBFS = new ArrayList<>();

    /**
     * Instantiates a new Node.
     *
     * @param object the object
     */
    public Node(final int object) {
        this.object = object;
    }

    /**
     * Gets object.
     *
     * @return the object
     */
    public int getObject() {
        return object;
    }

    /**
     * Sets object.
     *
     * @param object the object
     */
    public void setObject(final int object) {
        this.object = object;
    }

    /**
     * Gets previous.
     *
     * @return the previous
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     * Sets previous.
     *
     * @param previous the previous
     */
    public void setPrevious(final Node previous) {
        this.previous = previous;
    }

    /**
     * Gets next.
     *
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets next.
     *
     * @param next the next
     */
    public void setNext(final Node next) {
        this.next = next;
    }

    public ArrayList<Node> getNextNodesBFS() {
        return nextNodesBFS;
    }

    @Override
    public String toString() {
        return ""+object;
    }
}
