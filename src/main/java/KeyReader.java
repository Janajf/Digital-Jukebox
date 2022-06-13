import java.io.InputStream;
import java.util.Base64;
import java.util.Scanner;

public class KeyReader {

    public String getKey() {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(".credentials");

        if (inputStream != null) {
            try (Scanner reader = new Scanner(inputStream)) {
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    String[] keyValue = line.split("=");
                    if (keyValue[0].equals("apiKey")) {
                        return keyValue[1];
                    }
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }

        return null;
    }


}
