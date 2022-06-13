import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public class FileLoaderTests {

    @Test
    public void fileLoaderTest() throws FileNotFoundException {

        FileLoader fileLoader = new FileLoader("src/main/resources/song_list.txt");

        Map<String,Song> actual = fileLoader.load();

        int expected = 25;

        Assert.assertEquals(expected,actual.size());
        
    }
}
