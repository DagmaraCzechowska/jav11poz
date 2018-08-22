package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;
import pl.sda.bookstore.BookCollection;

import java.util.Scanner;

public class BookCollectionMenu {

    private final Scanner sc;
    private final BookCollection bookCollection;

    BookCollectionMenu(Scanner sc, BookCollection bookCollection){
        this.sc = sc;
        this.bookCollection = bookCollection;
    }

    public void showMenu(){
        System.out.println("1. Dodaj ksiażkę w formacie: tytył, autor, cena, typ, ocena");
        System.out.println("2. Dodaj ksiażkę w formacie: tytył, autor, typ");
        System.out.println("3. Pokaż kolekcje ksiażek");
        System.out.println("4. Usuń ksiażkę - podaj tytuł");

        switch(sc.nextInt()){
            case 1:
                sc.nextLine();
                String dataFromUser = sc.nextLine();
                bookCollection.add(dataFromUser);
                break;
            case 2:
                sc.nextLine();
                String dataFromUser2 = sc.nextLine();
                bookCollection.add(dataFromUser2);
                break;
            case 3:
                sc.nextLine();
                bookCollection.showAllBooks();
            case 4:
                sc.nextLine();
                bookCollection.removeBook(sc.nextLine());


        }
    }
}