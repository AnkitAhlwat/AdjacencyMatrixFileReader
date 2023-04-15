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
//        fileReader.findAllPathsBFS();
        fileReader.findAllPathsDFS(11);
    }
}
