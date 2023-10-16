package it.monyet.flex.just;

import reactor.core.publisher.Flux;

public class FlexJustMain {
    public static void main(String[] args) {

        /*
         * posso inserire più sottoscrittori .
         * Posso applicare un filtraggio alla pipe e farla sottoscrivere  al suo sottoscrittore
         */

        FlexJustService flexJustService= new FlexJustService();
        //flexJustService.getNames().subscribe(next->System.out.println(next));


        Flux<String> nameFilter= flexJustService.getNames().filter(name->name.equalsIgnoreCase("simone"));
        flexJustService.getNames().subscribe(next->System.out.println(next));

        nameFilter.subscribe(res->System.out.print(res));


    }
}
