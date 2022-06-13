import java.io.FileNotFoundException;
import java.util.*;

public class Catalog {


    private Map<String, Song> catalog;
    private Map<String,List<Song>> songsByGenre = new HashMap<>();
    private Map<String,List<Song>> songsByArtist = new HashMap<>();
    private Map<String,List<Song>> songsByAlbum = new HashMap<>();
    private Map<String,Song> songsByTitle = new HashMap<>();

    public Catalog(FileLoader fileLoader) throws FileNotFoundException {
        catalog = fileLoader.load();
        sortByGenre();
        sortByArtist();
        sortByAlbum();
        sortByTitle();


    }

    private void sortByGenre() {
        for(Song song: catalog.values()){
            String genre = song.getGenre();
            List<Song> songs = songsByGenre.get(genre);
            if(songs == null){
                songs = new ArrayList<>();
                songsByGenre.put(genre,songs);
            }
            songs.add(song);

        }
    }

    private void sortByArtist(){
        for(Song song: catalog.values()){
            String artist = song.getArtist();
            List<Song> songs = songsByArtist.get(artist);
            if(songs == null){
                songs = new ArrayList<>();
                songsByArtist.put(artist,songs);
            }
            songs.add(song);
        }
    }

    private void sortByAlbum(){
        for(Song song: catalog.values()){
            String album = song.getAlbum();
            List<Song> songs = songsByAlbum.get(album);
            if(songs == null){
                songs = new ArrayList<>();
                songsByAlbum.put(album,songs);
            }
            songs.add(song);
        }
    }

    private void sortByTitle(){
        for(Song song: catalog.values()){
            String title = song.getTitle();
            songsByTitle.put(title,song);
        }
    }

    public Map<String, Song> getSongsByTitle() {
        return songsByTitle;
    }

    public Song getSongByTitle(String title){
        return songsByTitle.get(title);
    }

    public List<Song> getSongsByGenre(String genre){
        return songsByGenre.get(genre);
    }

    public List<Song> getSongsByArtist(String artist){
        return songsByArtist.get(artist);
    }

    public List<Song> getSongsByAlbum(String album){
        return songsByAlbum.get(album);
    }

    public Map<String,List<Song>> getAllSongsByGenre(){
        return songsByGenre;
    }

    public Song getSongById(int id){
        return catalog.get(id);
    }

    public Map<String, Song> getCatalog() {
        return catalog;
    }

    public List<String> getArtists(){
        return new ArrayList<String>(songsByArtist.keySet());
    }

    public List<String> getAlbums(){
        return new ArrayList<String>(songsByAlbum.keySet());
    }

    public List<String> getGenre(){
        return new ArrayList<String>(songsByGenre.keySet());
    }
}
