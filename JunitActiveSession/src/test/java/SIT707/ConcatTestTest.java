package SIT707;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatTestTest {

    @Test
    void concat() {
        ConcatTest junit = new ConcatTest();
        String result = junit.concat("App","le");
        Assertions.assertEquals("Apple",result);
    }
}