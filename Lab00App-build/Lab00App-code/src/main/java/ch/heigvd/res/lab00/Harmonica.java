package ch.heigvd.res.lab00;

public class Harmonica implements IInstrument {

    private final static int VOLUME = 50;
    private final static String SOUND = "dap dap";
    private final static String COLOR = "ivory";

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
