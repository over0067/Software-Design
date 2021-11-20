package app;

public class ListenRadioFacade {
    private Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    private Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
    private DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    private CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
    private Projector projector = new Projector("Top-O-Line Projector", dvd);
    private TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    private Screen screen = new Screen("Theater Screen");
    private PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    public void startRadio(){
//        turn the tuner on
        tuner.on();
//        set the frequence to the required number
        tuner.setFrequency(99.8);
//        turn the amplifier on
        amp.on();
//        set the amplifier volume to 5
        amp.setVolume(5);
//        set the amplifier to tuner mode
        amp.setTuner(tuner);
    }
    public void stopRadio(){
        tuner.off();
        amp.off();
    }
}
