import java.util.ArrayList;

public class DijkstraNode {
    private  Object object;
    private ArrayList<DijkstraNode> next;
    private ArrayList<DijkstraNode> previousList;
    private Integer lengthFromStart;

    public DijkstraNode(Object object) {
        this.object = object;
        next = new ArrayList<>();
        previousList = new ArrayList<>();
        lengthFromStart = null;
    }

    public Object getObject() {
        return object;
    }
    public int getInt(){
        return (int)object;
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

    public ArrayList<DijkstraNode> getPreviousList() {
        return previousList;
    }

    public void setPreviousList(ArrayList<DijkstraNode> previousList) {
        this.previousList = previousList;
    }

    public Integer getLengthFromStart() {
        return lengthFromStart;
    }

    public void setLengthFromStart(Integer lengthFromStart) {
        this.lengthFromStart = lengthFromStart;
    }

    @Override
    public String toString() {
        return "DijkstraNode{" +
                "object=" + object +
                ", next=" + next +
                '}';
    }
}
