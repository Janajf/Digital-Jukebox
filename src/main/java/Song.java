import java.util.Date;

public class Song {

    private String title;
    private String album;
    private String artist;
    private String genre;
    private String releaseDate;
    private int length;
    private int id;

    //constructor
    public Song(String title, String album, String artist,String genre, String releaseDate, int length){
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.length = length;
    }

    // getters
    public String getTitle(){
        return title;
    }

    public String getAlbum(){
        return album;
    }

    public String getArtist(){
        return artist;
    }

    public String getGenre() {return genre; }

    public int getId(){
        return id;
    }

    public String getReleaseDate(){
        return releaseDate;
    }

    public int getLength(){
        return length;
    }
    //setters

    public void setTitle(String title){
        this.title = title;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setLength(int length){
        this.length = length;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", album='" + album + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", length=" + length +
                '}';
    }
}
