package conditioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondeyTest {

    Condey condey = new Condey();

    @Test
    void test() {

        assertFalse(condey.isOn());
        assertNull(condey.getName());

        condey.setOn(true);
        condey.setName("Bork");

        assertTrue(condey.isOn());
        assertEquals("Bork", condey.getName());
        assertEquals(22, condey.getCurrentTemp());
    }

    @Test
    void minTempTest() {
        condey.increaseTemp();
        assertEquals(10, condey.getMinTemp());
    }

    @Test
    void maxTempTest() {
        condey.increaseTemp();
        assertEquals(25, condey.getMaxTemp());
    }

    @Test
    void increaseTest() {
        Condey condey = new Condey(15);
        condey.increaseTemp();
        assertEquals(16, condey.getCurrentTemp());
    }

    @Test
    void increaseMaxTest() {
        Condey condey = new Condey(25);
        condey.increaseTemp();
        assertEquals(25, condey.getCurrentTemp());
    }

    @Test
    void decreaseTest() {
        Condey condey = new Condey(13);
        condey.decreaseTemp();
        assertEquals(12, condey.getCurrentTemp());
    }

    @Test
    void decreaseMinTest() {
        Condey condey = new Condey(10);
        condey.decreaseTemp();
        assertEquals(10, condey.getCurrentTemp());
    }

}