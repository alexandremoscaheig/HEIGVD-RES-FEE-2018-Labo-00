package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

public class MaracasTest {
    @Test
    public void aMaracasShouldMakeCloung() {
        IInstrument maracas = new Maracas();
        String sound = maracas.play();
        Assert.assertEquals("cloung", sound);
    }
}
