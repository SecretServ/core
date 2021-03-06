package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;
        public Book(String author) {
            this.author = author;
        }
        public abstract Book getBook();
        public abstract String getTitle();
        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            String output = "output";
            //Add your code here
            if (this instanceof AgathaChristieBook ){
                output = agathaChristieOutput;
            } else if (this instanceof MarkTwainBook){
                output = markTwainOutput;
            }

            return output;
        }



        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {
        public String title;

        public MarkTwainBook(String str) {
            super("Mark Twain");
            title = str;
        }

        public MarkTwainBook getBook(){
            return this;
        }
        public String getTitle(){
            return title;
        }
    }

    public static class AgathaChristieBook extends Book {
        public String title;
        public AgathaChristieBook(String str){
            super("Agatha Christie");
            title = str;
        }
        /*public AgathaChristieBook(){
            super("Agatha Christie");
        }*/
        public AgathaChristieBook getBook(){
            return this;
        }
        public String getTitle(){
            return title;
        }
    }
}
