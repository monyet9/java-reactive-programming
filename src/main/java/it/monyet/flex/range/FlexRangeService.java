package it.monyet.flex.range;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FlexRangeService {



    /*
     * con la funzione range posso  generare una serie di items nella mia pipeLine range(start,count)
     * start: indice di inizio
     * count:contatore , fine .
     *
     * come nel mio esempio può essere utilizzato come un ciclo for per ciclare una lista
     */
    public Flux<String> getNamesFromList(List<String> names){
        Flux<String> it= Flux.range(0,names.size()).map(i->names.get(i)).filter(name->name.contains("a"));
        return it;
    }


    // posso trasformare un flex di item in un mono . Ad esempio ho bisogno di uno specifico item  nel mio flux
    // la funzone da utilizzare è next()

    public Mono<String> getNamesFromList(){
        Flux<String> it= Flux.range(0,10).map(s->"hello number: "+s);

        // con next converto la flux , precisamente l'item di una flux in mono
        Mono<String> primeItem= it.next();

        Mono<String> secondItems= it.filter(i-> i.contains("2")).next();

        Mono.just(primeItem);

        return primeItem;
    }

}
