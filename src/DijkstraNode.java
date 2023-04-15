import java.util.ArrayList;

public class DijkstraNode {
    private  Object object;
    private ArrayList<DijkstraNode> next;
    private ArrayList<DijkstraNode> previous;

    public DijkstraNode(Object object) {
        this.object = object;
        next = new ArrayList<>();
        previous = new ArrayList<>();
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ArrayList<DijkstraNode> getNext() {
        return next;
    }

    public void setNext(ArrayList<DijkstraNode> next) {
        this.next = next;
    }

    public ArrayList<DijkstraNode> getPrevious() {
        return previous;
    }

    public void setPrevious(ArrayList<DijkstraNode> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "DijkstraNode{" +
                "object=" + object +
                ", next=" + next +
                '}';
    }
}
