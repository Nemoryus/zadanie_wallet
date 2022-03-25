package main.java;

import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import static org.junit.Assert.*;

/**
 * Created by Nemoryus 22.3.2022
 */

public class LoadCsvDataTest {
    private LoadCsvData loadCsvData;

    @Before
    public void init() throws IOException {
        loadCsvData = new LoadCsvData();
    }

    @Test
    public void compareLoadCsvDataIntoList(){
        AtomicInteger expectListIndex = new AtomicInteger();
        List<List<String>> actualList = loadCsvData.records;
        List<List<String>> expectList =  Arrays.asList(
                Arrays.asList("Adam", "2m", "20", "1m", "20", "5", "10", "500", "15","25"),
                Arrays.asList("Fero", "1m", "8m", "2m", "30","50","20","100","5m", "10"),
                Arrays.asList("Dusan", "20", "5m", "10", "2m", "1m", "50", "70", "25", "12", "4m"),
                Arrays.asList("Brano", "2222", "2m", "22", "11", "111","81","14"));

        actualList.forEach((list)->{
            assertEquals(list,expectList.get(expectListIndex.get()));
            expectListIndex.getAndIncrement();
        });



    }
}