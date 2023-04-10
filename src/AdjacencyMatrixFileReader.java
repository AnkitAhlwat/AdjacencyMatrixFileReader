import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * The type Adjacency matrix file reader.
 *
 * @author Ankit Ahlwat
 * @version 2023
 */
public class AdjacencyMatrixFileReader {

    /**
     * The String array of the text file.
     */
    private String[] stringArray;


    /**
     * Instantiates a new Adjacency matrix file reader.
     */
    public AdjacencyMatrixFileReader() {
    }

    /**
     * Read strings in txt file.
     *
     * @param filePath the file path
     * @return the content in file in a string
     */
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

    /**
     * Get string array string [ ].
     *
     * @return the string [ ]
     */
    public String[] getStringArray() {
        return stringArray;
    }

    /**
     * Sets string array.
     *
     * @param stringArray the string array
     */
    public void setStringArray(final String[] stringArray) {
        this.stringArray = stringArray;
    }

    /**
     * Find the shortest path.
     *
     * @param startVertex the start vertex
     * @param endVertex   the end vertex
     */
    public void findShortestPath(final int startVertex, final int endVertex) {
        Deque<Node> queue = new LinkedList<>();
        Node currentNode = new Node(startVertex);
        ArrayList<Integer> visited = new ArrayList<>();
        ArrayList<Node> paths = new ArrayList<>();
        if (startVertex == endVertex) {
            linkNodesTogether(currentNode);
            return;
        }
        queue.add(currentNode);
        visited.add(startVertex);
        while (!queue.isEmpty()) {
            for (int i = 0; i < stringArray.length; i++) {
                if (stringArray[queue.element().getObject()].charAt(i) == '1' && !visited.contains(i)) {
                    Node tempNode = new Node(i);
                    tempNode.setPrevious(queue.element());
                    visited.add(i);
                    if (i != endVertex) {
                        queue.add(tempNode);
                    } else {
                        paths.add(tempNode);
                        visited.remove(visited.size() - 1);
                        break;
                    }
                }
            }
            queue.remove();
        }
        linkNodesTogether(retainSmallestPathsOnly(paths));
    }

    private void linkNodesTogether(final ArrayList<Node> nodeList) {
        if (nodeList.isEmpty()) {
            System.out.println("No paths found");
        }
        for (Node node: nodeList) {
            Node currentNode = node;
            while (currentNode.getPrevious() != null) {
                currentNode.getPrevious().setNext(currentNode);
                currentNode = currentNode.getPrevious();
            }
            printShortestPath(currentNode);
        }
    }
    private void linkNodesTogether(final Node node) {
        Node currentNode = node;
        while (currentNode.getPrevious() != null) {
            currentNode.getPrevious().setNext(currentNode);
            currentNode = currentNode.getPrevious();
        }
        printShortestPath(currentNode);
    }

    private ArrayList<Node> retainSmallestPathsOnly(final ArrayList<Node> nodeArrayList) {
        int smallestLength = stringArray.length - 1;
        ArrayList<Node> toRemove = new ArrayList<>();
        for (Node node: nodeArrayList) {
            int currentLength = 0;
            Node currentNode = node;
            while (currentNode.getPrevious() != null) {
                currentLength += 1;
                currentNode = currentNode.getPrevious();
            } if (currentLength > smallestLength) {
                toRemove.add(node);
            } else {
                smallestLength = currentLength;
            }
        }
        for (Node node:toRemove) {
            nodeArrayList.remove(node);
        }
        return nodeArrayList;
    }


    private void printShortestPath(final Node node) {
        int length = 0;
        Node currentNode = node;
        while (currentNode != null) {
            length += 1;
            System.out.printf("%s->", currentNode.getObject());
            currentNode = currentNode.getNext();
        }
        System.out.printf("END (This path has a length of %s)%n", length);
    }
}
