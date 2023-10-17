package it.monyet.flex.range;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainFlexRange {
    public static void main(String[] args) {
        FlexRangeService flexRangeService= new FlexRangeService();

        List<String> lists= Arrays.asList("francesco","nicola","saverio","gianluc");

        flexRangeService
                .getNamesFromList(lists)
                .subscribe(res->System.out.println(res));

    }
}
