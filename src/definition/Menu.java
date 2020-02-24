package definition;

import definition.MyLinkedList;
import helper.Node;
import helper.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    private MyLinkedList<Person> linkedList;
    private Scanner scan;

    public Menu() {
        scan = new Scanner(System.in);
        linkedList = new MyLinkedList<>();
    }

}