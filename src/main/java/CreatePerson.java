package main.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * This class is for create list of object Person.
 *
 * Created by Nemoryus 22.3.2022
 */

public class CreatePerson {
    public List<Person> listOfPeople = new ArrayList<>();

    public CreatePerson() throws IOException {
        LoadCsvData loadCsvData = new LoadCsvData();
        createPerson(loadCsvData.records);
    }
    
    private void createPerson(List<List<String>> pList){
        pList.forEach((list)->{
            Person person = new Person();
            person.setName(list.get(0));
            int[] listOfMoney =  list.stream().filter(Pattern.compile("^[\\d]+$").asPredicate())
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();
            person.setSmallestBanknote(listOfMoney[0]);
            person.setLargestBanknote(listOfMoney[listOfMoney.length-1]);
            listOfPeople.add(person);
        });
    }
}
