import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitalJukebox {

    public Catalog getCatalog() {
        return catalog;
    }

    private final Catalog catalog;

    public DigitalJukebox(Catalog catalog){
        this.catalog = catalog;
    }

    // search by artist
    public List<Song> searchByArtist(String name){
        return catalog.getSongsByArtist(name);
    }

    // search by album
    public List<Song> searchByAlbum(String album){
        return catalog.getSongsByAlbum(album);
    }

    // search by genre
    public List<Song> searchByGenre(String genre) throws InvalidGenreException {
        Map<String, List<Song>> genres = catalog.getAllSongsByGenre();
        if (genres.containsKey(genre)) {
            return catalog.getSongsByAlbum(genre);
        } else{
            throw new InvalidGenreException();
        }
    }

    // play song
    public Song playSong(int id) throws InvalidSongException {
        Map<String, Song> songs = new HashMap<>();
        songs = catalog.getCatalog();

        if (songs.containsKey(id)) {
            return catalog.getSongById(id);

        } else {
            throw new InvalidSongException();
        }
    }

    /*

    TODO

     create playlist method

     add song to queue method

     */




}
