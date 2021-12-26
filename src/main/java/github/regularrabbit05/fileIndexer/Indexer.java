package github.regularrabbit05.fileIndexer;

import github.regularrabbit05.fileIndexer.types.Index;

public class Indexer {
    public static void main(String[] args) {
        Index fileIndex = (Index) Utils.ReadObjectFromFile("yourFile.bin");
        boolean writeResult = !(fileIndex == null);
        System.out.println("Result = " + writeResult);
        boolean readResult = Utils.WriteObjectToFile(fileIndex, "yourFile.bin");
        System.out.println("Result = " + readResult);
    }
}