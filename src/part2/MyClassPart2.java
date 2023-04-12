package part2;

import java.util.Scanner;

public class MyClassPart2 {
    public void program() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int a = (int) (Math.random() * words.length);
        String c = words[a];
        System.out.println(c);
        String stringPerson = null;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите слово");
            stringPerson = scanner.next();
            if (stringPerson.equals(c) == true) {
                System.out.println("Поздравляю!!! Вы угадали слово)");
                System.exit(0);
            } else {
                System.out.println("Вы не угадали слово");
                for (int i = 0; i < 15; i++) {
                    if (i < stringPerson.length() && i < c.length() && stringPerson.charAt(i) == c.charAt(i)) {
                        System.out.print(stringPerson.charAt(i));
                    } else {
                        System.out.print((!stringPerson.equals(c)) ? "#" : "");
                    }

                }
                System.out.println();
            }
        } while (!stringPerson.equals(c));

    }
}