package com.jnprogrammer;

import java.util.Random;
import java.util.Scanner;

public class Main {
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
    }


    public void printInstructions(){
        System.out.printf("Welcome to the MAdLibs Game. If you type in " +
        "Words, we'll give you a story. Start by typing a Name Human.");
    }

    public void enterName(){

    }
    public void putTogetherStory(){
       String story = "Jessy and her best friend " + getName() +
                " went to Lava World today! " +
                "and they saw a " + getNoun1() + " just as it fell into the lava. " +
               "and was offered " + getAdjective1() + " to eat " + "Soon after the offered meal Jessy " +
               "ran " + getAdverb() + "To the closet bathroom, and found " + getNoun2() + "In her surprise " +
               getRandomNums() + "Ninja's from the hidden lava village attacked " + getAdjective2() + "She used her ninja Jutsu to defeat them " +
               getNoun3() + ".";
        setStory(story);
    }
    public static void main(String[] args) {

    }
}

