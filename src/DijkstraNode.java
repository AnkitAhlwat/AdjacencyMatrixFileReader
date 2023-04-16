import java.util.ArrayList;

/**
 * A node for an un-weighted graph using the Dijkstra Method.
 *
 * @author Ankit Ahlwat
 * @version 2023
 */
public class DijkstraNode {
    private  Object object;
    private ArrayList<DijkstraNode> nextList;
    private ArrayList<DijkstraNode> previousList;
    private Integer lengthFromStart;

    /**
     * Instantiates a new Dijkstra node.
     *
     * @param object the object
     */
    public DijkstraNode(final Object object) {
        this.object = object;
        nextList = new ArrayList<>();
        previousList = new ArrayList<>();
        lengthFromStart = null;
    }

    /**
     * Gets object.
     *
     * @return the object
     */
    public Object getObject() {
        return object;
    }

    /**
     * Get int int.
     *
     * @return the int
     */
    public int getInt() {
        return (int) object;
    }

    /**
     * Sets object.
     *
     * @param object the object
     */
    public void setObject(final Object object) {
        this.object = object;
    }

    /**
     * Gets next list.
     *
     * @return the next list
     */
    public ArrayList<DijkstraNode> getNextList() {
        return nextList;
    }

    /**
     * Sets next list.
     *
     * @param nextList the next list
     */
    public void setNextList(final ArrayList<DijkstraNode> nextList) {
        this.nextList = nextList;
    }

    /**
     * Gets previous list.
     *
     * @return the previous list
     */
    public ArrayList<DijkstraNode> getPreviousList() {
        return previousList;
    }

    /**
     * Sets previous list.
     *
     * @param previousList the previous list
     */
    public void setPreviousList(final ArrayList<DijkstraNode> previousList) {
        this.previousList = previousList;
    }

    /**
     * Gets length from start.
     *
     * @return the length from start
     */
    public Integer getLengthFromStart() {
        return lengthFromStart;
    }

    /**
     * Sets length from start.
     *
     * @param lengthFromStart the length from start
     */
    public void setLengthFromStart(final Integer lengthFromStart) {
        this.lengthFromStart = lengthFromStart;
    }

    /**
     * Return the object.
     *
     * @return the object
     */
    @Override
    public String toString() {
        return "" + object;
    }
}
