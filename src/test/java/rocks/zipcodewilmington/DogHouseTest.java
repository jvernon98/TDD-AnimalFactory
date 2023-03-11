package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    // TODO - Create tests for `void add(Dog dog)` DONE
    // TODO - Create tests for `void remove(Integer id)` DONE 
    // TODO - Create tests for `void remove(Dog dog)`DONE
    // TODO - Create tests for `Dog getDogById(Integer id)` DONE
    // TODO - Create tests for `Integer getNumberOfDogs()` DONE

// command n for new test
    @Test
    public void testAddDog() {
        //Given
        Integer expectedNumberOfDogs = 1;
        DogHouse.clear();

        //When
        Dog dog1 = new Dog(null, null, null);
        DogHouse.add(dog1);
        Integer actualNumberOfDogs = DogHouse.getNumberOfDogs();


        //Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);

    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testGetID() {

        Dog dog1 = new Dog(null, null, 1);
        DogHouse.add(dog1);

        Dog actualID = DogHouse.getDogById(1);

        Assert.assertEquals(actualID, dog1);
    }

    @Test
    public void removeDog() {
        Integer expectedNumberOfDogs = 0;
        Dog dog1 = new Dog(null, null, null);
        DogHouse.clear();
        DogHouse.add(dog1);

        //When
        DogHouse.remove(dog1);
        Integer actualNumberOfDogs = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);

    }

    @Test
    public void removeDogByID() {
        Integer expectedNumberOfDogs = 0;
        Dog ID = new Dog(null, null, 1);
        DogHouse.add(ID);
        DogHouse.clear();


        //When
        DogHouse.remove(1);
        Integer actualNumberOfDogs = DogHouse.getNumberOfDogs();


        //Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }
}
