package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataFakeGenerate {

    final Faker faker = new Faker(Locale.ENGLISH);

    public static DataFakeGenerate generateTo() {
        return new DataFakeGenerate();
    }

    public static String docName(){
        String docName = generateTo().faker.animal().name();
        return  docName;
    }


}