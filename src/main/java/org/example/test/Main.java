package org.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;



//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что в во входной структуре
// будут повторяющиеся имена с разными телефонами, их необходимо считать,
// как одного человека с разными телефонами. Вывод должен быть отсортирован
// по убыванию числа телефонов.
public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();

        AddContact contact = new AddContact();
        contact.addCont(phoneBook);
        contact.addCont(phoneBook);
        contact.addCont(phoneBook);
        contact.addCont(phoneBook);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Удалить контакт? Введите да или нет: ");
        String param = scanner.nextLine().toUpperCase();
        if (param.equals("ДА")) {
            removeContact.removeCont(phoneBook);
        }
        System.out.println(phoneBook);

        for (Entry<String, ArrayList<Integer>> elem : phoneBook.entrySet()) {
            System.out.println(elem.getKey() + ":" + elem.getValue());
            System.out.println(elem.getValue().size());
            //int max = 0;
        }





    }
}
