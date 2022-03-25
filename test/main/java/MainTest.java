package main.java;

import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

/**
 * Created by Nemoryus 22.3.2022
 */

public class MainTest {
    private CreatePerson createPerson;

    @Before
    public void init() throws IOException {
        createPerson = new CreatePerson();
    }

    @Test
    public void adamWallet(){
        String name = "Adam";
        int smallestBanknote = 5 ;
        int largestBanknote = 500;

        Person findPerson = createPerson.listOfPeople.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name)).findAny().orElse(null);

        assertEquals((int)findPerson.getSmallestBanknote(),smallestBanknote);
        assertEquals((int)findPerson.getLargestBanknote(),largestBanknote);
    }

    @Test
    public void feroWallet(){
        String name = "Fero";
        int smallestBanknote = 10 ;
        int largestBanknote = 100;

        Person findPerson = createPerson.listOfPeople.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name)).findAny().orElse(null);

        assertEquals((int)findPerson.getSmallestBanknote(),smallestBanknote);
        assertEquals((int)findPerson.getLargestBanknote(),largestBanknote);
    }

    @Test
    public void dusanWallet(){
        String name = "Dusan";
        int smallestBanknote = 10 ;
        int largestBanknote = 70;

        Person findPerson = createPerson.listOfPeople.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name)).findAny().orElse(null);

        assertEquals((int)findPerson.getSmallestBanknote(),smallestBanknote);
        assertEquals((int)findPerson.getLargestBanknote(),largestBanknote);
    }

    @Test
    public void bramoWallet(){
        String name = "Brano";
        int smallestBanknote = 11;
        int largestBanknote = 2222;

        Person findPerson = createPerson.listOfPeople.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name)).findAny().orElse(null);

        assertEquals((int)findPerson.getSmallestBanknote(),smallestBanknote);
        assertEquals((int)findPerson.getLargestBanknote(),largestBanknote);
    }

}