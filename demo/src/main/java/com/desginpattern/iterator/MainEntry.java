package com.desginpattern.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// <snippet_classdef_1>
public class MainEntry {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        Book book1 = new Book("Bible");
        Book book2 = new Book("Cinderella");
        Book book3 = new Book("Daddy-Long-Legs");

        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        bookShelf.appendBook(book3);

        System.out.println("현재 꽂혀있는 책 : " + bookShelf.getLength() + "권");

        Iterator<Book> it = bookShelf.createIterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }


        // 일반 arraylist 요소 삭제와 iterator를 통한 요소 삭제 

        ArrayList<String> array = new ArrayList<String>(List.of("1","2","3","4"));

        for (String v : array) {

            System.out.println(v);

            if(v=="3")
                array.remove(v);
            
        } 

        System.out.println("=======================");
        array = new ArrayList<String>(List.of("1","2","3","4"));
        Iterator<String> il = array.iterator();
        while(il.hasNext()){
            String v = il.next().toString();
            System.out.println(v);

            if(v=="3")
                il.remove();

        }
    }

}