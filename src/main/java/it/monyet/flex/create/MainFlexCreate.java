package it.monyet.flex.create;

import it.monyet.subscription.custom.DefaultSub;
import reactor.core.publisher.Flux;

public class MainFlexCreate {


    public static void main(String[] args) {


        //posso creare l'implementazione di una pipeline di un publisher.
        Flux.create(fluxSink -> {
            for(int i=0;i<10;i++) {
                fluxSink.next(i+" position");
            }
                }
        ).subscribeWith(new DefaultSub());

        // per spostare l'implemtazione dall'interno ad una pipeline , proprio in una classe .
        // poptrò implemetare l'interfaccia Consumer
        DefaultProducer def = new DefaultProducer();
        Flux.create(def)
                .subscribe(new DefaultSub());
        def.produceName();

    };



}
