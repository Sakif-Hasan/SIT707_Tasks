package SIT707;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTestTest {

    @Test
    void add() {
        AddTest junit = new AddTest();
        int result = junit.add(10,20);
        Assertions.assertEquals(30,result);
    }
}