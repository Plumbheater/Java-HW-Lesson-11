import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

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


//=====================================================================================================================

    @Test
    public void setStandartSettingsRadioStation() {
        Radio number = new Radio();

        Assertions.assertEquals(10, number.getAmountOfStations());
        Assertions.assertEquals(0, number.getMinNumberStation());
        Assertions.assertEquals(9, number.getMaxNumberStation());
        Assertions.assertEquals(0, number.getCurrentStation());
        Assertions.assertEquals(1, number.getNextStation());
        Assertions.assertEquals(9, number.getPrevStation());
    }

    @Test
    public void setLowAmountStation() {
        Radio number = new Radio(0);
        Assertions.assertEquals(0, number.getAmountOfStations());
        Assertions.assertEquals(0, number.getMinNumberStation());
        Assertions.assertEquals(0, number.getMaxNumberStation());
        Assertions.assertEquals(0, number.getCurrentStation());
        Assertions.assertEquals(0, number.getNextStation());
        Assertions.assertEquals(0, number.getPrevStation());
    }

    @Test
    public void setAmountStationAndChangeCurrentStation() {
        Radio number = new Radio(10);
        number.setCurrentStation(5);

        Assertions.assertEquals(10, number.getAmountOfStations());
        Assertions.assertEquals(0, number.getMinNumberStation());
        Assertions.assertEquals(9, number.getMaxNumberStation());
        Assertions.assertEquals(5, number.getCurrentStation());
        Assertions.assertEquals(6, number.getNextStation());
        Assertions.assertEquals(5, number.getPrevStation());
    }
}