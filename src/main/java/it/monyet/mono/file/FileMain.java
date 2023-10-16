package it.monyet.mono.file;

public class FileMain {

    public static void main(String[] args) {
        FileService fileService= new FileService();
        String fileName="fileProva.txt";
        fileService.getContent(fileName)
                .subscribe(result->System.out.println(result),
                        err->err.printStackTrace(),
                        ()->System.out.println("completed")
                );
        fileService.deleteAsync(fileName)
                .subscribe(result->System.out.println(result));

    }
}
