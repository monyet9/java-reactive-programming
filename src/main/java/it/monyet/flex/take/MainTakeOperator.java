package it.monyet.flex.take;

import it.monyet.subscription.custom.DefaultSub;
import reactor.core.publisher.Flux;

public class MainTakeOperator {
    public static void main(String[] args) {

        /*
         * il take è un operatore che serve a bloccare il flusso in upstream .
         * Cancella e invia un segnale di complete() , quindi non c'è piu nulla da inviare al sottoscrittore
         */
        Flux.range(1,10)
                .take(3)
                .subscribe(new DefaultSub());
    }
}
