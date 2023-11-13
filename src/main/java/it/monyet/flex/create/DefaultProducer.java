package it.monyet.flex.create;
import reactor.core.publisher.FluxSink;
import java.util.function.Consumer;

public class DefaultProducer implements Consumer<FluxSink<String>> {

    /*
     * laflunk serve a rendere flessibile la sink , a sincronizzarla nel thread corrente , qualora iu thread lavorano sullo stesso oggetto .
     */

    private FluxSink name;

    @Override
    public void accept(FluxSink<String> stringFluxSink) {
        this.name=stringFluxSink;
    }

    @Override
    public Consumer<FluxSink<String>> andThen(Consumer<? super FluxSink<String>> after) {
        return Consumer.super.andThen(after);
    }


    public void produceName(){
        for(int i =0; i<10 ; i++){
            name.next("elemento numero"+i);
        }
    }

}
