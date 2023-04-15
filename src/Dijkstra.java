import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Dijkstra {
    public String[] stringArray;

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
