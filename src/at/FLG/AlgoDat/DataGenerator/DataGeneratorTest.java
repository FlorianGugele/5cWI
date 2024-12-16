package at.FLG.AlgoDat.DataGenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {
        int[] data = DataGenerator.generateDataArray(10);
        for (int i : data) {
            System.out.println("i:" + i);
        }
        Assertions.assertEquals(data.length, 10);
    }

    @Test
    void testGenerateDataArray2() {

    }
}
