package it.monyet.flex.just;

import reactor.core.publisher.Flux;

public class FlexJustService {


    // set di dati già pronti .
    // la classe flux diversamente dal mono gestisce da 0 a n item .
    // con la funzione just setto i dati all'iterno della mia pipeline

    public Flux<String> getNames(){
        return Flux.just("francesco","simone");
    }
}
