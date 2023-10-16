package it.monyet.mono.subscribe;


import reactor.core.publisher.Mono;
public class MonoSubscribe {

    public static void main(String[] args) {

        //creo l'edirtore con unn set di dati , in questo caso una stringa.
        Mono<String> editor = Mono.just("hello");

        //per consumare i dati l'editore deve avere minimo un sottoscrittore , un cosumatore . In questo caso,
        // l'implemetazione mi permette tramite l'interfaccia consumer di gestire un sottoscrittore ed il suo metodo next , error, complete
        editor.subscribe(
                            next->System.out.println(next),
                            err -> err.printStackTrace(),
                            ()->System.out.println("complete")
        );

    }
}
