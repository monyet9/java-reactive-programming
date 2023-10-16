package it.monyet.mono.service;

public class MonoMainController {



    public static void main(String[] args) {
        MonoService monoService =  new MonoService();

        monoService.getName(Long.valueOf(1))
                .subscribe(
                        result-> System.out.println(result),
                        err->err.printStackTrace(),
                        ()->System.out.println("from supplier complete")
                );


        monoService
                .deleteFullName(1L).subscribe(
                        result-> System.out.println(result)
                );


    }
}
