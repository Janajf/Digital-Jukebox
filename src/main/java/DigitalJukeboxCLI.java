
import api.genius.model.Hit;
import api.genius.services.GeniusApiService;
import org.springframework.web.client.RestTemplate;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class DigitalJukeboxCLI {

    private Menu menu;
    private DigitalJukebox digitalJukebox;

    private String[] menuOptions = MAIN_MENU_OPTIONS;

    RestTemplate restTemplate = new RestTemplate();

    // Scanner
    Scanner scanner = new Scanner(System.in);

    // Constructor
    public DigitalJukeboxCLI(Menu menu, DigitalJukebox digitalJukebox) {
        this.menu = menu;
        this.digitalJukebox = digitalJukebox;


    }

    public static void main(String[] args) {

        Menu menu = new Menu(System.in, System.out);

        FileLoader fileLoader = new FileLoader("src/main/resources/song_list.txt");

        Catalog catalog = null;
        try {
            catalog = new Catalog(fileLoader);
        } catch (FileNotFoundException e) {
            System.out.println("Could not load catalog " + e.getMessage());
        }

        GeniusApiService geniusApiService = new GeniusApiService();

        Hit[] hits = geniusApiService.getHits("The Weather");

        DigitalJukebox digitalJukebox = new DigitalJukebox(catalog);

        DigitalJukeboxCLI cli = new DigitalJukeboxCLI(menu, digitalJukebox);
        cli.run();
    }

    private static final String MAIN_MENU_OPTION_SEARCH_SONG = "Search";
    private static final String MAIN_MENU_OPTION_LISTEN_TO_SONG = "Listen";
    private static final String MAIN_MENU_CLOSE_APPLICATION = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_SEARCH_SONG, MAIN_MENU_OPTION_LISTEN_TO_SONG, MAIN_MENU_CLOSE_APPLICATION};

    private static final String SEARCH_MENU_OPTION_SEARCH_ARTIST = "Artist";
    private static final String SEARCH_MENU_OPTION_SEARCH_ALBUM = "Album";
    private static final String SEARCH_MENU_CLOSE_SEARCH_GENRE = "Genre";
    private static final String[] SEARCH_MENU_OPTIONS = {SEARCH_MENU_OPTION_SEARCH_ARTIST, SEARCH_MENU_OPTION_SEARCH_ALBUM, SEARCH_MENU_CLOSE_SEARCH_GENRE};

    private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "View Songs";
    private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Song";
    private static final String PURCHASE_MENU_FINISH_TRANSACTION = "Finish Listening";
    private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_FINISH_TRANSACTION};


    public void run() {
        boolean runProgram = true;
        while (runProgram) {
            String choice = (String) menu.getChoiceFromOptions(menuOptions);

            if (choice.equals(MAIN_MENU_OPTION_SEARCH_SONG)) {
                System.out.println("Search by artist, album, or genre: ");

                List<Song> songs;

                String searchChoice = (String) menu.getChoiceFromOptions(SEARCH_MENU_OPTIONS);

                Catalog catalog = digitalJukebox.getCatalog();

                if (searchChoice.equals(SEARCH_MENU_OPTION_SEARCH_ARTIST)) {
                    List<String> artists = catalog.getArtists();

                    String[] artistArray = artists.toArray(new String[0]);

                    String artistChoice = (String) menu.getChoiceFromOptions(artistArray);

                    System.out.println("You selected the artist " + artistChoice);
                    songs = catalog.getSongsByArtist(artistChoice);

                } else if (searchChoice.equals(SEARCH_MENU_OPTION_SEARCH_ALBUM)) {
                    List<String> albums = catalog.getAlbums();

                    String[] albumsArray = albums.toArray(new String[0]);

                    String albumsChoice = (String) menu.getChoiceFromOptions(albumsArray);

                    System.out.println("You selected the album " + albumsChoice);

                    songs = catalog.getSongsByAlbum(albumsChoice);

                } else {
                    List<String> genre = catalog.getGenre();

                    String[] genreArray = genre.toArray(new String[0]);

                    String genreChoice = (String) menu.getChoiceFromOptions(genreArray);

                    System.out.println("You selected the genre " + genreChoice);
                    songs = catalog.getSongsByGenre(genreChoice);

                }
                String[] songArray = new String[songs.size()];

                for (int i = 0; i < songs.size(); i++) {
                    songArray[i] = songs.get(i).getTitle();

                }
                String songChoice = (String) menu.getChoiceFromOptions(songArray);
                System.out.println("You selected the song " + songChoice);

                Song song = catalog.getSongByTitle(songChoice);

                System.out.println(song);
            }




    }

}}