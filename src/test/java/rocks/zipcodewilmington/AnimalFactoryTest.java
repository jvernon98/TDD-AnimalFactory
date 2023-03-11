package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //Given

    @Test
    public void testDogConstructor() {

        String name = "Taylor";
        Date birthDate = new Date(4/2018);
        Integer givenID = 0;

        Dog dog = new Dog(name, birthDate, 0);
    }

    @Test
    public void testCatConstructor() {

        String name = "Kamir";
        Date birthDate = new Date(1/2016);
        Integer givenID = 0;

        Cat cat = new Cat(name, birthDate, 0); 
    }

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
