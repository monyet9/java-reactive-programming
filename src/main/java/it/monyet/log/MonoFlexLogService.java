package it.monyet.log;

import it.monyet.flex.just.FlexJustService;
import reactor.core.publisher.Flux;

public class MonoFlexLogService {

    private FlexJustService flexJustService= new FlexJustService();

    //con il log posso esaminare una pipeline e vedere cosa succede , posta in mezzo ai vari step verifica cosa succede fra uno step ed un altro
    public Flux<String> getNamesWithLog(){

        Flux<String> provaLogsFlux=Flux.range(0,3)
                .map(i-> "indice i = :"+i);
        return Flux.range(0,3)
                .map(i-> "indice i = :"+i);

    }

}
