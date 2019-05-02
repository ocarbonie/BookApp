package com.company;
/*
*Create another class called BookApp which contains
* the main method. In the main method you shall create
* an instance of a Book and print the Author, Title and
* Description.
 */

public class BookApp {

    public static void main(String[] args) {

        Book novel = new Book();
        novel.setAuthor("Philippa Gregory");
        novel.setTitle("The Other Boleyn Girl");
        novel.setDescription("Two sisters attempt " +
                "their chance to the throne through the king's heart.");
        novel.getDisplayText();
    }
}
