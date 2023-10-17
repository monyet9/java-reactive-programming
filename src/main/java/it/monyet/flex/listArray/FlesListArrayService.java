package it.monyet.flex.listArray;

import reactor.core.publisher.Flux;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class FlesListArrayService {


    //PIPELINE FROM LIST
    public Flux<String> getNamesFromList(){
        List<String> names= new ArrayList<>();
        names.add("simone");
        names.add("Francesco");
        names.add("ciro");

        return Flux.fromIterable(names);
    }

    //PIPELINE FROM ARRAY
    public Flux<String> getNamesFromArray(){
        String[] names={"Ciro","popo","pipi"};
        return Flux.fromArray(names);
    }

}
