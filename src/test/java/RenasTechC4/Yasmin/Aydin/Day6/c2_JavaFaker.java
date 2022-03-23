package RenasTechC4.Yasmin.Aydin.Day6;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class c2_JavaFaker {
    @Test
    // to be able to use the library you need to create instance object from the class
    public void TC_JavaFaker(){
        Faker faker = new Faker();
        System.out.println("faker.name().fullName()=" + faker.name().fullName());
        System.out.println(faker.name().firstName());
        System.out.println(faker.address().cityName());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.lordOfTheRings().character());
        System.out.println(faker.artist().name());
    }
}
