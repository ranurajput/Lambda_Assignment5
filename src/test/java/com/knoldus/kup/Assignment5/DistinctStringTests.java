package com.knoldus.kup.Assignment5;

import junit.framework.Assert;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctStringTests {

    //      Given test cases
    List<String> stringList = new ArrayList<>(Arrays.asList("java", "scala", "java", "clojure", "clojure"));
    List<String> stringList2 = new ArrayList<>(Arrays.asList("the", "three", "the", "three", "the", "three","an","an","a"));

    @Test
    public void shouldReturnDistinct(){
        List<String> expected1 = Arrays.asList("clojure","java","scala");
        List<String> expected2 = Arrays.asList("a","an","the","three");

        List<String> distincList1= DistinctString.getDistinctStrings(stringList);
        List<String> distincList2= DistinctString.getDistinctStrings(stringList2);

        Assert.assertEquals(expected1,distincList1);
        Assert.assertEquals(expected2,distincList2);
        System.out.println("Test case has passed Successfully");
        System.out.println(expected1);
        System.out.println(expected2);
    }
}
/*
OUTPUT-->
Test case has passed Successfully
[clojure, java, scala]
[a, an, the, three]
===============================================
Default Suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================

 */
