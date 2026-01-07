import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageByteConverter {
    public static void main(String[] args) {
        String originalImagePath = "E:\\BRIJLAB\\Java Programs\\InputStream\\input.jpg";
        String outputImagePath = "output.jpg";

        try {
            File inputFile = new File(originalImagePath);
            FileInputStream fileInput = new FileInputStream(inputFile);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInput.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            fileInput.close();
            byte[] imageBytes = baos.toByteArray();
            baos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImagePath);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image copied successfully!");

            byte[] originalBytes = Files.readAllBytes(new File(originalImagePath).toPath());
            byte[] outputBytes = Files.readAllBytes(new File(outputImagePath).toPath());

            if (Arrays.equals(originalBytes, outputBytes)) {
                System.out.println("Verification successful: Files are identical.");
            } else {
                System.out.println("Verification failed: Files are different.");
            }

        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
    }
}