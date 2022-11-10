package com.desginpattern.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// <snippet_classdef_1>
public class Main {

    public static void main(String[] args) {


        BookShelf bookShelf = new BookShelf(10);

        Book book1 = new Book("Bilbe");
        Book book2 = new Book("Cinderella");
        Book book3 = new Book("Daddy-Long-Legs");

        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        bookShelf.appendBook(book3);

        System.out.println("현재 꽂혀있는 책 : " + bookShelf.getLength() + "권");

        Iterator it = bookShelf.createIterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }


    







        ArrayList<String> array = new ArrayList<String>(List.of("1","2","3","4"));

        for (String v : array) {

            System.out.println(v);

            if(v=="3")
                array.remove(v);
            
        } 

        System.out.println("=======================");
        array = new ArrayList<String>(List.of("1","2","3","4"));


        Iterator il = array.iterator();


        while(il.hasNext()){
            String v = il.next().toString();
            System.out.println(v);

            if(v=="3")
                il.remove();

        }


   

    }

}