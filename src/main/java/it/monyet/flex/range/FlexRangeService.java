package it.monyet.flex.range;

import reactor.core.publisher.Flux;

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
}
