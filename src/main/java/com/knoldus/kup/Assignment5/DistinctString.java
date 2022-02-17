package com.knoldus.kup.Assignment5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
public class DistinctString {
    public static List<String> getDistinctStrings(List<String> stringList){
        // writing lambda for the given requirement
        Function<List<String>, List<String>> distinctStrings = str -> str.stream()
                .distinct() // getting distinct elements
                .sorted() // sorting the list
                .collect(Collectors.toList()); // collecting as a list
        return distinctStrings.apply(stringList);
    }
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        System.out.println("Compiled by Ranu Rajput");
        System.out.println("Type words in single line using space and press enter");
        Scanner input =new Scanner(System.in);
        String line = input.nextLine();

        String[] stringList3= line.split("\\s");
        for (String str:stringList3) {
            list.add(str);
        }
//      output
        System.out.println("Distinct Values"+DistinctString.getDistinctStrings(list));
    }
}
/*
OUTPUT-->
Compiled by Ranu Rajput
Type words in single line using space and press enter
Ranu Rajput is a Java Developer
Distinct Values[Developer, Java, Rajput, Ranu, a, is]

ranu ranu is is 
Distinct Values[is, ranu]
 */
