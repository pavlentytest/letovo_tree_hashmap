package ru.samsung.itschool.mdev;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class Person {
    String name;
    int mark;

    public Person(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}
public class Main {
    public static void main(String[] args) {
        // JSON
        // Java Script Object Notation
        // "{"name": "Ivan","mark": 40}"
        Person ivan = new Person("Ivan",40);
        // сериализовать объект
        // библиотека GSON - Google SON (Script Object Notation)
        Gson gson = new Gson();
        String ivan_string = gson.toJson(ivan);
        System.out.println(ivan_string);
        String petr_string = "{\"name\":\"Petr\",\"mark\":80}";
        Person petr = gson.fromJson(petr_string,Person.class);

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Max");
        names.add("Max");
        names.add("Max");
        names.add("Olga");
        names.add("Maria");
        names.add("Maria");

        TreeSet<String> treeSet = new TreeSet<>(names);
        for(String s: treeSet) {
            System.out.println(s);
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ivan",34583458); // hash =
        hashMap.put("Ivan",78699449);
        hashMap.put("Petr",786922);
        hashMap.put("Oleg",786922);

        for(Map.Entry<String,Integer> p: hashMap.entrySet()) {
            System.out.println(p.getKey() + ", "+p.getValue());
        }





    }

}
