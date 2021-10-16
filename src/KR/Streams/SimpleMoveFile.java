package KR.Streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleMoveFile {
    public static void main(String[] args) {
        File sourceFile = new File("C:\\Users\\akropachev\\IdeaProjects\\lessons\\src\\KR\\Streams\\sourceFile.txt");
        File targerFile = new File("C:\\Users\\akropachev\\IdeaProjects\\lessons\\src\\targetFile.txt");

        try {
            Files.move(sourceFile.toPath(), targerFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
