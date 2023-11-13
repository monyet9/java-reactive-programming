package it.monyet.log;

public class Main {
    public static void main(String[] args) {
        MonoFlexLogService monoFlexLogService= new MonoFlexLogService();
        monoFlexLogService
                .getNamesWithLog()
                .log()
                .subscribe(i-> System.out.println("subscribe +"+i));

    }
}
