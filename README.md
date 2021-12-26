# ArchiveIndexer
Sample program to create a list of files

```java
        Index fileIndex = (Index) Utils.ReadObjectFromFile("yourFile.bin");
        boolean writeResult = !(fileIndex == null);
        System.out.println("Result = " + writeResult);
        boolean readResult = Utils.WriteObjectToFile(fileIndex, "yourFile.bin");
        System.out.println("Result = " + readResult);
```
