package app;

public class Main {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        WatchMovieFacade watchMovie = new WatchMovieFacade();
        watchMovie.startMovie();
        watchMovie.stopMovie();

        ListenMusicFacade listenMusic = new ListenMusicFacade();
        listenMusic.startMusic();
        listenMusic.stopMusic();

        ListenRadioFacade listenRadio = new ListenRadioFacade();
        listenRadio.startRadio();
        listenRadio.stopRadio();
    }
}
