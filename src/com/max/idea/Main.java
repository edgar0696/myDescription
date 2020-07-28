package com.max.idea;

public class Main {
    public static void main(String[] args) {
        //Переміннні текс
        String word = "Hello group!";
        String name = "My Name is";
        String name1 = "Edgar";
        String years = "I am";
        String years1 = "Years old";
        String height = "My height";
        String height1 = "cm";
        String city = "I am from";
        String city1 = "Chernivtsi";
        String salary = "I want a salary of";
        String salary1 = "$";
        String c = " ";
        //Переміннні цифри
        byte years2 = 24;
        short height2 = 167;
        int salary2 = 3000;
        //Вивод
        System.out.println(word);
        System.out.println(name + c + name1);
        System.out.println(years + c + years2 + c + years1);
        System.out.println(height + c + height2 + c + height1);
        System.out.println(city + c + city1);
        System.out.println(salary + c + salary2 + salary1);

    }
}
