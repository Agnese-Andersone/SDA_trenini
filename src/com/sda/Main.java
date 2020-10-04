package com.sda;

public class Main {

    public static void main(String[] args) {
        Poem[] poems = new Poem[3];

        poems[0] = new Poem(
                new Author("Kociņš","latvian")
                ,100);
        poems[1] = new Poem(
                new Author("Zariņš","latvian")
                ,200);
        poems[2] = new Poem(
                new Author("Lapiņa","latvian")
                ,300);

        Poem longest = poems[0];

        for(int i = 0; i < poems.length; i++) {
            if (poems[i].stropheNumbers > longest.stropheNumbers)
                longest = poems[i];
        }
        System.out.println("Author with the longest poem: ");
        System.out.println(longest.author.surname);

    }
}
