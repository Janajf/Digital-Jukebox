import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.fail;

public class CatalogTests {

    @Test
    public void sortByHiphopGenreTest() throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader("src/main/resources/song_list.txt");

        Catalog catalog = new Catalog(fileLoader);

        String genre = "Hip Hop";

        List<Song> actual = catalog.getSongsByGenre(genre);

        int expected = 10;

        Assert.assertEquals(expected,actual.size());

    }

    @Test
    public void sortByAfrobeatsGenreTest() throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader("src/main/resources/song_list.txt");

        Catalog catalog = new Catalog(fileLoader);


        String genre ="Afrobeats";

        List<Song> actual = catalog.getSongsByGenre(genre);

        int expected = 5;

        Assert.assertEquals(expected,actual.size());

    }

    @Test
    public void sortByArtistMichaelTest() throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader("src/main/resources/song_list.txt");

        Catalog catalog = new Catalog(fileLoader);


        String artist ="Michael Jackson";

        List<Song> actual = catalog.getSongsByArtist(artist);

        int expected = 5;

        Assert.assertEquals(expected,actual.size());

    }

    @Test
    public void sortByArtistRihannaTest() throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader("src/main/resources/song_list.txt");

        Catalog catalog = new Catalog(fileLoader);


        String artist ="Rihanna";

        List<Song> actual = catalog.getSongsByArtist(artist);

        int expected = 2;

        Assert.assertEquals(expected,actual.size());

    }
    @Test
    public void getAllSongsByGenre() throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader("src/main/resources/song_list.txt");

        Catalog catalog = new Catalog(fileLoader);

        Map<String,List<Song>> actual = catalog.getAllSongsByGenre();

        int expected = 4;

        Assert.assertEquals(expected,actual.size());


    }

    /*
    TODO
    Invalid data
     */
    @Test
    public void getAllSongsByGenreInvalidFile() throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader("src/main/resources/invalid.txt");


        try {
            new Catalog(fileLoader);

            fail("FileNotFoundException expected");
        } catch (FileNotFoundException e) {
            // expected
            }



    }


}
