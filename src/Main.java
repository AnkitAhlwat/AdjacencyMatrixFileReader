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
        AdjacencyMatrixFileReader fileReader = new AdjacencyMatrixFileReader();
        fileReader.readStrings("src/AdjacencyMatrixTextFile.txt");

        fileReader.findShortestPath(0, 1);
        fileReader.findShortestPath(0, 0);
        fileReader.findShortestPath(0, 8);
        fileReader.findShortestPath(2, 3);

    }
}
