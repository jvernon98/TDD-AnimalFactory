package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Test
    public void testAddCat() {
        //Given
        Integer expectedNumberOfCats = 1;
        CatHouse.clear();

        //When
        Cat cat1 = new Cat(null, null, null);
        CatHouse.add(cat1);
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();


        //Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);

    }

    @Test
    public void testGetID() {

        Cat cat1 = new Cat(null, null, 1);
        CatHouse.add(cat1);

        Cat actualID = CatHouse.getCatById(1);

        Assert.assertEquals(actualID, cat1);
    }

    @Test
    public void removeCat() {
        Integer expectedNumberOfCats = 0;
        Cat cat1 = new Cat(null, null, null);
        CatHouse.clear();
        CatHouse.add(cat1);

        //When
        CatHouse.remove(cat1);
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);

    }

    @Test
    public void removeCatByID() {
        Integer expectedNumberOfCats = 0;
        Cat ID = new Cat(null, null, 1);
        CatHouse.add(ID);
        CatHouse.clear();


        //When
        CatHouse.remove(1);
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();


        //Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }

    @Test
    public void getNumberOfCats() {
        Integer expectedNumberOfCats = 1;
        CatHouse.clear();

        //When
        Cat cat1 = new Cat(null, null, null);
        CatHouse.add(cat1);
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();


        //Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }



    // TODO - Create tests for `void add(Cat cat)` DONE
    // TODO - Create tests for `void remove(Integer id)` DONE
    // TODO - Create tests for `void remove(Cat cat)`DONE
    // TODO - Create tests for `Cat getCatById(Integer id)`DONE
    // TODO - Create tests for `Integer getNumberOfCats()`
}
