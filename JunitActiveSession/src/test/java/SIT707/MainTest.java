package SIT707;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add() {
        Main junit = new Main();
        int result = junit.add(10,20);
        Assertions.assertEquals(30,result);
    }

    @Test
    void concat() {
        Main junit = new Main();
        String result = junit.concat("App","le");
        Assertions.assertEquals("Apple",result);

    }
}