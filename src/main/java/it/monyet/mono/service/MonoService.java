package it.monyet.mono.service;

import it.monyet.db.FakerDb;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class MonoService {

    //CREAZIONE DI UN SEMPLICE SERVICE CHE BUILDA LE PIPELINE




    // RECUPERO DAL DB IL NOME BY USERID
    //IMPLEMENTAZIONE METODO GET-NAME TRAMITE SUPPLIER
    public Mono<String> getName(Long userId){
        return Mono.fromSupplier(()-> FakerDb.getDB().name().fullName());
    }

    public Mono<String> deleteFullName(Long userId){
        System.out.println("sono in deleteFullName");
        return Mono.fromFuture(new CompletableFuture<String>()
                .supplyAsync(()->FakerDb.getDB().name().fullName()));
    }
}
