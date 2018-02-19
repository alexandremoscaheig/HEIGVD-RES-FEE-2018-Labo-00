package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

    private final static int VOLUME = 80;
    private final static String SOUND = "pouet";
    private final static String COLOR = "golden";

    @Override
    public String play() {
        return SOUND;
    }

    @Override
    public int getSoundVolume() {
        return VOLUME;
    }

    @Override
    public String getColor() {
        return COLOR;
    }
}
