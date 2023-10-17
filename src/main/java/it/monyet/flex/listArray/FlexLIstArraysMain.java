package it.monyet.flex.listArray;

public class FlexLIstArraysMain {
    public static void main(String[] args) {
        FlesListArrayService flesListArrayService= new FlesListArrayService();
        flesListArrayService.getNamesFromList().subscribe(res->System.out.println(res));

        flesListArrayService.getNamesFromArray().subscribe(res->System.out.println(res));


    }
}
