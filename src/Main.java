/**
 * The Driver.
 *
 * @author Ankit Ahlwat
 * @version 2023
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(final String[] args) {
        Dijkstra paths = new Dijkstra();
        paths.readStrings("src/AdjacencyMatrixTextFile.txt");
        paths.findShortestPathsBFS(0,6);
    }
}
