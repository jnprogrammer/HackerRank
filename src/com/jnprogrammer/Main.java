package com.jnprogrammer;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {
    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    //Getters;
    public String getStory(){
        return story;
    }

    public String getName() {
        return name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    public Random getRand() {
        return rand;
    }

    //setters
    public void setStory(String story) {
        this.story = story;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt() % 100);
        int index = 0;
        int[] numberHolder = new int[3];
        while(index < numberHolder.length){
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = "not "+ numberHolder[0]+ ", not" + numberHolder[1] + ", but " + numberHolder[2];
    }


    //print instructions
    public void printInstructions(){
        System.out.printf("Welcome to the MAdLibs Game. If you type in " +
                "Words, we'll give you a story. Start by typing a Name Human.");
    }

    //enter data
    public void enterName(){
        System.out.println("Give me a Name");
        setName(scanner.nextLine());
    }

    public void enterNoun1(){
        System.out.println("Give me a Noun");
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2(){
        System.out.println("Give me a second noun");
        setNoun2(scanner.nextLine());
    }

    public void enterNoun3(){
        System.out.println("Give me a third noun");
        setNoun3(scanner.nextLine());
    }

    public void enterAdj1(){
        System.out.println("Give me a Adjective");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdj2(){
        System.out.println("Give me another Adjective");
        setAdjective2(scanner.nextLine());
    }

    public void enterAdverb(){
        System.out.println("Give me a Adverb");
        setAdverb(scanner.nextLine());
    }


    public void putTogetherStory(){
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if(num == 0) {
            story = "Jessy and her best friend " + getName() +
                    " went to Lava World today! " +
                    "and they saw a " + getNoun1() + " just as it fell into the lava. " +
                    "and was offered " + getAdjective1() + " to eat " + "Soon after the offered meal Jessy " +
                    "ran " + getAdverb() + "To the closet bathroom, and found " + getNoun2() + "In her surprise " +
                    getRandomNums() + "Ninja's from the hidden lava village attacked " + getAdjective2() + "She used her ninja Jutsu to defeat them " +
                    getNoun3() + ".";
        }else{
            story = "Your fast asleep when at midnight, Naruto brusts through your window of your bedroom yelling " + getName() +
                    "you need to get the " + getNoun1() + " before the moon sets!! " + " Suddenly the " + getNoun2() + " broke into pieces " +
                    "Naruto jumps " + getAdverb() + "Over the " + getNoun3() + " Which melted " + getAdjective2() + " into the floor." + getRandomNums()
                    + " of the pieces " + getAdjective2() + " in the moon light which triggered " + getName() + " hidden power activated and sealed the " + getNoun1();
        }
        setStory(story);
    }

    public void play(){
        enterName();
        enterNoun1();
        enterAdj1();
        enterAdj2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        putTogetherStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
        MadLibs game = new MadLibs();
        game.printInstructions();

    }
}

