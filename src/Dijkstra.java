import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Dijkstra {
    public String[] stringArray;
    private ArrayList<DijkstraNode> unVisited;

    private HashMap<Integer, DijkstraNode> dijkstraNodeHashMap;

    public String readStrings(final String filePath) {
        try {
            String stringFromFile = Files.readString(Path.of(filePath));
            makeAdjacencyList(stringFromFile);
            return stringFromFile;
        } catch (IOException ex) {
            ex.printStackTrace();
            return "Could Not Find File, Please Try Again";
        }
    }

    private void makeAdjacencyList(final String stringFromFile) {
        stringArray = stringFromFile.split("\n");
    }

    public void findShortestPathsBFS(int startingNode, int endingNode) {
        unVisited = new ArrayList<>();
        dijkstraNodeHashMap = new HashMap<>();
        makeNodeList();
        dijkstraNodeHashMap.get(startingNode).setLengthFromStart(0);
        Deque<DijkstraNode> dijkstraNodeDeque = new LinkedList<>();
        dijkstraNodeDeque.add(dijkstraNodeHashMap.get(startingNode));
        while (!dijkstraNodeDeque.isEmpty()) {
            DijkstraNode currentNode = dijkstraNodeDeque.peek();
            int currentNodePosition = currentNode.getInt();
            for (int i = 0; i < stringArray.length; i++) {
                if (i == currentNodePosition) {
                    continue;
                }
                if (stringArray[currentNodePosition].charAt(i) == 1 && unVisited.contains(dijkstraNodeHashMap.get(i))) {
                    DijkstraNode nextNode = dijkstraNodeHashMap.get(i);
                    dijkstraNodeDeque.add(nextNode);
                    int length = 1 + currentNode.getLengthFromStart();
                    if (length <= nextNode.getLengthFromStart() || nextNode.getLengthFromStart() == null) {
                        nextNode.setLengthFromStart(length);
                        nextNode.getPreviousList().add(currentNode);
                    }
                }
            }
            unVisited.remove(dijkstraNodeDeque.poll());
        } connectNodes(dijkstraNodeHashMap.get(endingNode));
    }

    private void makeNodeList() {
        for (int i = 0; i < stringArray.length; i++) {
            DijkstraNode currentNode = new DijkstraNode(i);
            unVisited.add(currentNode);
            dijkstraNodeHashMap.put(i, currentNode);
        }
    }
    private void connectNodes(DijkstraNode endingNode){
        if (endingNode.getPreviousList()!=null){
            for (DijkstraNode node: endingNode.getPreviousList()) {
                node.getNext().add(endingNode);
                connectNodes(node);
            }
        }
    }
}
