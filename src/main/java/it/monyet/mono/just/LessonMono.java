package it.monyet.mono.just;

/*
 * Nella programmazione reattiva si ragiona con dei flussi di dati .
 * L'implemetazione utilizzata della specifica JavaReactiveProgrammStream sarà Reactor.
 *
 * Classe Mono: la classe serve a gestire da 0a un Item(oggetto)
 */

import reactor.core.publisher.Mono;

public class LessonMono {

    public static void main(String[] args) {

        //supponiamo che sia il nostro pubblicatore .
        // con mono.just indico che ho dei dati da inviare
        Mono<Integer> editor= Mono.just(1);


        // per ottenere i dati un publisher deve avere un sottoscrittore che consumi i dai .
        // in questo caso Mono ci offre diverse implementazione per abbonare un sottoscrittore ad un pubblicatore .
        editor.subscribe(i->System.out.println(i));
        
    }
}
