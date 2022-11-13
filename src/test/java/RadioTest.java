import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setMaxNumberStation() {
        Radio number = new Radio(10, 0, 9, 9, 0);
        Assertions.assertEquals(10, number.getAmountStation());
        Assertions.assertEquals(0, number.getMinNumberStation());
        Assertions.assertEquals(9, number.getMaxNumberStation());
        Assertions.assertEquals(0, number.getNumberStation());
        Assertions.assertEquals(0, number.getNextStation());
        Assertions.assertEquals(9, number.getPrevStation());
    }

    @Test
    public void setHighMaxNumberStation() {
        Radio number = new Radio(10, 0, 10, 8, 1);
        Assertions.assertEquals(10, number.getAmountStation());
        Assertions.assertEquals(0, number.getMinNumberStation());
        Assertions.assertEquals(9, number.getMaxNumberStation());
        Assertions.assertEquals(0, number.getNumberStation());
        Assertions.assertEquals(9, number.getNextStation());
        Assertions.assertEquals(0, number.getPrevStation());
    }

    @Test
    public void setMinNumberStation() {
        Radio number = new Radio(1, 0, 0, 0, 0);
        Assertions.assertEquals(1, number.getAmountStation());
        Assertions.assertEquals(0, number.getMinNumberStation());
        Assertions.assertEquals(0, number.getMaxNumberStation());
        Assertions.assertEquals(0, number.getNumberStation());
        Assertions.assertEquals(0, number.getNextStation());
        Assertions.assertEquals(0, number.getPrevStation());
    }
//=====================================================================================================================

    @Test
    public void setVolume() {
        Radio volume = new Radio(100, 1, 99, 2);
        Assertions.assertEquals(1, volume.getSetVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
        Assertions.assertEquals(1, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getPlusVolume());
        Assertions.assertEquals(1, volume.getMinusVolume());
    }

    @Test
    public void setMaxVolume() {
        Radio volume = new Radio(100, 0, 100, 0);
        Assertions.assertEquals(0, volume.getSetVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getPlusVolume());
        Assertions.assertEquals(0, volume.getMinusVolume());
    }

    @Test
    public void setMinVolume() {
        Radio volume = new Radio(0, 0, 0, 0);
        Assertions.assertEquals(0, volume.getSetVolume());
        Assertions.assertEquals(0, volume.getMaxVolume());
        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(0, volume.getPlusVolume());
        Assertions.assertEquals(0, volume.getMinusVolume());
    }
}
