package com.animal;

import java.util.Scanner;

import static java.util.Calendar.*;

public class Main {

    public static void main(String[] args) {
        /** Кундорго enum тузунуз (Monday, Tuesday ...)
         консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм"
         же Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм" деп
         кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
         Жуманын кундорун кыргыз тилинде корсотунуз.

         */
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        switch (a.toUpperCase()) {
            case "MONDAY":
                System.out.println(Days.MONDAY.getLessons());
                break;
            case "TUESDAY": {
                System.out.println(Days.TUESDAY.getLessons());
                break;

            }
            case "THURSDAY": {
                System.out.println(Days.THURSDAY.getLessons());

            }
            case "WEDNESDAY": {
                System.out.println(Days.WEDNESDAY.getLessons());
            }
            case "FRIDAY": {
                System.out.println(Days.FRIDAY.getLessons());

            }
            case "SATURDAY": {
                System.out.println(Days.SATURDAY.getLessons());
            }
            case "SUNDAY":
                System.out.println(Days.SUNDAY.getLessons());
            default:
                System.out.println("DEFAULT");
        }
    }
}