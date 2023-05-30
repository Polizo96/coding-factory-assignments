package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {

    public static void main(String[] args) {
        byte[] videoBytes;
        Path sourcePath = Paths.get("/Users/nikospolizopoulos/Desktop/v1.mp4");
        Path targetPath = Paths.get("/Users/nikospolizopoulos/Desktop/v1out.mp4");

        try  {
            videoBytes = Files.readAllBytes(sourcePath);
            Files.write(targetPath, videoBytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
