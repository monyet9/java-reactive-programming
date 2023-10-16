package it.monyet.mono.supplier;

import it.monyet.db.FakerDb;
import reactor.core.publisher.Mono;

public class MonoSupplier {

    public FakerDb fakerDb= new FakerDb();

    public static void main(String[] args) {

        //con monoFromSupplier posso restituire un oggetto sono se effettivamente ci sono abbonati;
        // Quando non ci sono abbonati l'impelentazione mono non deve lavorare alcun metodo .
       Mono<String> editor= Mono.fromSupplier(()->getName());
        editor.subscribe(
                next->System.out.println(next),
                err-> err.printStackTrace(),
                ()->System.out.println("complete")
        );


        Mono<String> editor2=Mono.fromCallable(()->getName());
    }

    private static String getName(){
        System.out.println("enter");
        return FakerDb.getDB().name().name();
    }
}
