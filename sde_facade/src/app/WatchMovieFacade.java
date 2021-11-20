package app;

public class WatchMovieFacade {

    private Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    private Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
    private DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    private CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
    private Projector projector = new Projector("Top-O-Line Projector", dvd);
    private TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    private Screen screen = new Screen("Theater Screen");
    private PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    public void startMovie () {
        popper.on();
        popper.pop();
        lights.dim(35);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        dvd.inject();
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play("The Shining");
    }

    public void stopMovie () {
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
