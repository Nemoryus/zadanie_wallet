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

public class CreatePersonTest {
    private CreatePerson createPerson;

    @Before
    public void init() throws IOException {
        createPerson = new CreatePerson();
    }

    @Test
    public void testListOfPeople(){
        AtomicInteger expectListIndex = new AtomicInteger();
        List<Person> listOfPeople = Arrays.asList(  new Person("Adam",5,500),
                                                    new Person("Fero",10,100),
                                                    new Person("Dusan",10,70),
                                                    new Person("Brano",11,2222));

        createPerson.listOfPeople.forEach(person -> {
            assertEquals(listOfPeople.get(expectListIndex.get()).getName(),person.getName());
            assertEquals((int)(listOfPeople.get(expectListIndex.get()).getSmallestBanknote()),(int)person.getSmallestBanknote());
            assertEquals((int)(listOfPeople.get(expectListIndex.get()).getLargestBanknote()),(int)person.getLargestBanknote());

            expectListIndex.getAndIncrement();

        });

    }

}