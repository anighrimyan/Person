package Main;

import Person.*;
//import com.*
import java.util.*;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Person per = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        per.set_first_name(sc.nextLine());
        System.out.print("Last name: ");
        per.set_last_name(sc.nextLine());
        System.out.print("Age: ");
        per.set_age(sc.nextInt());
        System.out.println(per.get_first_name() + " " + per.get_last_name());
        System.out.println(per.get_age());

    }
}
