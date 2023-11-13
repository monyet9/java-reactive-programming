package it.monyet.flex.isCancelled;

import com.github.javafaker.Faker;
import it.monyet.subscription.custom.DefaultSub;
import jdk.jshell.execution.Util;
import reactor.core.publisher.Flux;

public class MainFlexIsCancelled {
    public static void main(String[] args) {
        Flux.create(fluxSink -> {
            String country;
            do {
                country= Faker.instance().country().name();
                System.out.println("country corrente in next(): " +country);
                fluxSink.next("send Country : " + country);
            }while (country.toLowerCase().equals("CANADA"));
                System.out.println("country corrente in complete() : " +country);
                fluxSink.complete();
        }).subscribe(new DefaultSub());
    }
}
