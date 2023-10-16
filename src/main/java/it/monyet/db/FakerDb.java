package it.monyet.db;

import com.github.javafaker.Faker;


    /*
     * LIBRERIA UTILIZZATA COME UNO STUB DI UN DB .
     * A RUN-TIME GENERA OGGGETTI RANDOM (ES:NOMI CASUALI ECC)
     */
public class FakerDb {
    private static Faker DB = Faker.instance();
    public static Faker getDB (){
        return DB;
    }
}
