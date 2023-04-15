import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstra {
    public String[] stringArray;
    private ArrayList<DijkstraNode> unVisited;
    private ArrayList<DijkstraNode> visited;
    private HashMap<DijkstraNode, Integer> shortestLength;


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

}
