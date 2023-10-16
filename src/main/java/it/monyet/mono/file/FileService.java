package it.monyet.mono.file;

import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;

public class FileService {

    private static Path PATH = Paths.get("src/main/resources");


    // getContent from resources
    public Mono<String> getContent(String fileName) {
        try {
            String content = Files.readString(PATH.resolve(fileName));
            return Mono.just(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Mono<Void> writeContent(String fileName, String content) {
            return Mono.fromRunnable(
                    ()-> {
                        try {
                            Files.writeString(PATH.resolve(fileName), content);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
            )
                    ;}


    public Mono<Void> delete(String fileName){
            return Mono.fromRunnable(()-> {
                try {
                    Files.delete(PATH.resolve(fileName));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
    }
    public Mono<String> deleteAsync(String fileName){
        return Mono.fromFuture(new CompletableFuture<String>()
                .supplyAsync(()->{
                    try {
                        String fileNameDeleted=fileName;
                        Files.delete(PATH.resolve(fileName));
                        return fileNameDeleted;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }));
    }



}
