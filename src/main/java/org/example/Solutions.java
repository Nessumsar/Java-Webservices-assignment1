package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Solutions {


    private static void fizzBuzz() {
        int random = (int) Math.floor(Math.random() * 100);
        boolean mod3 = random % 3 == 0;
        boolean mod5 = random % 5 == 0;

        if (mod3 && mod5){
            System.out.println("FizzBuzz"+random);
        }else if(mod3) {
            System.out.println("Fizz"+random);
        }else if(mod5){
            System.out.println("Buzz"+random);
        }else{
            System.out.println(random);
        }
    }


    private static void Doubles(List<Integer> numberList) {
        HashSet<Integer> set = new HashSet<>(numberList);
        ArrayList<Integer> finalList = new ArrayList<>(set);
        System.out.println(finalList);
    }


    private static void talkPirateLanguage(String phrase) {
        StringBuilder sb = new StringBuilder();
        char consonantArray[] = "qwrtpsdfghjklzxcvbnm".toCharArray();
        char phraseArray[] = phrase.toLowerCase().toCharArray();
        for (char c : phraseArray) {
            sb.append(c);
            for (char consonant : consonantArray) {
                if (c == consonant) {
                    sb.append("o");
                }
            }
        }
        String result = sb.toString();
        result = result.substring(0,1).toUpperCase() + result.substring(1);
        System.out.println(result);
    }


    private static void translatePirateLanguage(String phrase){
        StringBuilder sb = new StringBuilder();
        char phraseArray[] = phrase.toLowerCase().toCharArray();
        for (int i=0; i<phraseArray.length; i++) {
            if (phraseArray[i] == 'o'){
                if(phraseArray[i+1] == 'o'){
                    sb.append(phraseArray[i]);
                }
            }else{
                sb.append(phraseArray[i]);
            }
        }
        String result = sb.toString();
        result = result.substring(0,1).toUpperCase() + result.substring(1);
        System.out.println(result);
    }


    public static int ricecorn(int limit){
        int score = 1;
        int counter = 0;
        while(score <= limit){
            counter++;
            score = score * 2;
        }
        return counter;
    }


    public static void main( String[] args ) {
        fizzBuzz();

        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 3, 2, 2, 3, 2, 1, 4));
        Doubles(numberList);

        talkPirateLanguage("Lite jobbigt att läsa va?");

        translatePirateLanguage("Loitoe jooboboigoto atoto loäsoa voa?");

        System.out.println(ricecorn(1000000));
    }
}
