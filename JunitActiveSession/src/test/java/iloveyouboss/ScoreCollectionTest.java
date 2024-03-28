package iloveyouboss;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCollectionTest {

    @BeforeEach
    void setUp() {
        // Setup object
        ScoreCollection scoreCollection = new ScoreCollection();
    }

    @Test
    void add() {
        ScoreCollection scoreCollection = new ScoreCollection();
        Scorable scorable = new Scorable() {
            @Override
            public int getScore() {
                return 90;
            }
        };

        // add object
        scoreCollection.add(scorable);
    }

    @Test
    void arithmeticMean() {
        ScoreCollection scoreCollection = new ScoreCollection();

        scoreCollection.add(new Scorable() {
            @Override
            public int getScore() {
                return 10;
            }
        });

        scoreCollection.add(new Scorable() {
            @Override
            public int getScore() {
                return 15;
            }
        });

        int mean = scoreCollection.arithmeticMean();
        assertEquals(12,mean);

    }
}