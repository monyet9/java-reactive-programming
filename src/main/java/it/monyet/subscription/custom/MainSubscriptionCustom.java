package it.monyet.subscription.custom;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Mono;

public class MainSubscriptionCustom {
    public static void main(String[] args) {


        Mono<String> names= Mono.just("HELLO");
        names.subscribeWith(new Subscriber<String>() {
            @Override
            public void onSubscribe(Subscription subscription) {
                subscription.request(1);

            }

            @Override
            public void onNext(String s) {
                    System.out.println("onNext"+s);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onNext"+throwable);
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        });
    }
}
