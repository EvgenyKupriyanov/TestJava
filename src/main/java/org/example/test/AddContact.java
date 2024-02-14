package org.example.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class AddContact {
    /**
     * @ApiNote Добавляет контакт
     * @param phoneBook
     */
    public void addCont(Map<String, ArrayList<Integer>> phoneBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.println("Введите номер телефона: ");
        Integer number = scanner.nextInt();
        ArrayList<Integer> book = new ArrayList<Integer>();
        if (!phoneBook.containsKey(name)) {
            book.add(number);
            phoneBook.put(name, book);
        } else {
            ArrayList<Integer> prevBook = phoneBook.get(name);
            prevBook.add(number);
            phoneBook.put(name, prevBook);
        }
    }
}
