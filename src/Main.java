/**
 * The Driver.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Dijkstra paths = new Dijkstra();
        paths.readStrings("src/AdjacencyMatrixTextFile.txt");
        paths.findShortestPathsBFS(1,6);
    }
}
