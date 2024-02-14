package org.example.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class removeContact {
    /**
     * @ApiNote Удаляет контакт
     * @param phoneBook
     */
    public static void removeCont(Map<String, ArrayList<Integer>> phoneBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя удаляемого контакта: ");
        String name = scanner.nextLine().toUpperCase();
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
        } else {
            System.out.println("Такого контакта нет.");
            System.out.println("Введите имя удаляемого контакта повторно. Введите да или нет");
            String otvet = scanner.nextLine().toUpperCase();
            if (otvet.equals("ДА")) {
                removeCont(phoneBook);
            } else {
                System.out.println("Спасибо");
            }

        }

    }
}
