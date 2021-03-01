package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[] args) {

        Collector<Bean, ?, Map<String, String>> beanMapCollector = Collectors.toMap(Bean::getA, Bean::getB);
        List<Bean> list = new ArrayList();
        list.add(new Bean("a","b"));
        list.add(new Bean("c","d"));
        Map<String, String> collect = list.stream().collect(Collectors.toMap(Bean::getA, Bean::getB));
        System.out.println(collect);


    }
}
