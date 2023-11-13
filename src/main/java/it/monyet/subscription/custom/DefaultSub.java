package it.monyet.subscription.custom;


import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Mono;

public class DefaultSub implements Subscriber<Object> {

    @Override
    public void onSubscribe(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(Object s) {
            System.out.println(
                   s
            );
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {
            System.out.println("completato");
    }
}
