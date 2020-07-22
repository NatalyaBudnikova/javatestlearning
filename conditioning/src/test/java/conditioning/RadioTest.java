package conditioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    static final int DEFAULT_STATION = 4;
    static final int DEFAULT_VOLUME = 2;
    Radio radio = new Radio(DEFAULT_STATION, DEFAULT_VOLUME, true);

    @Test
    void onTest(){
        assertTrue(radio.isOn());
        radio.setOn(false);
        assertFalse(radio.isOn());
    }

    @Test
    void setStationTest() {
        radio.setStation(3);
        assertEquals(3, radio.getStation());
    }

    @Test
    void setStationMaxTest() {
        radio.setStation(radio.getMaxStation());
        assertEquals(radio.getMaxStation(), radio.getStation());
    }

    @Test
    void setStationMoreMaxTest() {
        radio.setStation(radio.getMaxStation() + 1);
        assertEquals(DEFAULT_STATION, radio.getStation());
    }

    @Test
    void setStationMinTest() {
        radio.setStation(radio.getMinStation());
        assertEquals(radio.getMinStation(), radio.getStation());
    }

    @Test
    void setStationLessMinTest() {
        radio.setStation(radio.getMinStation() - 1);
        assertEquals(DEFAULT_STATION, radio.getStation());
    }

    @Test
    void nextStationTest() {
        radio.next();
        assertEquals(DEFAULT_STATION + 1, radio.getStation());
    }

    @Test
    void nextStationMaxTest() {
        Radio radio = new Radio(9, DEFAULT_VOLUME, true);
        radio.next();
        assertEquals(radio.getMinStation(), radio.getStation());
    }

    @Test
    void previousStationTest() {
        radio.previous();
        assertEquals(DEFAULT_STATION - 1, radio.getStation());
    }

    @Test
    void previousStationMinTest() {
        Radio radio = new Radio(0, DEFAULT_VOLUME, true);
        radio.previous();
        assertEquals(radio.getMaxStation(), radio.getStation());
    }

    @Test
    void setMaxStationTest() {
        radio.setMaxStation(20);
        assertEquals(20, radio.getMaxStation());
    }

    @Test
    void increaseVolumeTest() {
        radio.increaseVolume();
        assertEquals(DEFAULT_VOLUME + 1, radio.getVolume());
    }

    @Test
    void increaseMaxVolumeTest() {
        Radio radio = new Radio(DEFAULT_STATION, 100, true);
        radio.increaseVolume();
        assertEquals(radio.getMaxVolume(), radio.getVolume());
    }

    @Test
    void decreaseVolumeTest() {
        radio.decreaseVolume();
        assertEquals(DEFAULT_VOLUME - 1, radio.getVolume());
    }

    @Test
    void decreaseMinVolumeTest() {
        Radio radio = new Radio(DEFAULT_STATION, 0, true);
        radio.decreaseVolume();
        assertEquals(radio.getMinVolume(), radio.getVolume());
    }
}