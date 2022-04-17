package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        doublyLinkedList list = new doublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("\t DOUBLEY LINKED LIST ");
            System.out.println("1)Add NODE END ");
            System.out.println("2) ADD NODE AT START");
            System.out.println("3)ADD NODE AT SPECIFIC LOCATION");
            System.out.println("4)DELETE NODE FROM START OR FROM ANY LOCATION");
            System.out.println("5) SHOW THE DATA  ");
             input = sc.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Enter 1 to Add Node in the list ");
                    int b = sc.nextInt();
                    list.AddNode(b);
                    System.out.println("LIST AFTER ADDING NODE ");
                    list.show();
                    break;
                }
                case 2: {
                    System.out.println("Enter 2 to ADD Node At Start");
                    int b = sc.nextInt();
                    list.AddStart(b);
                    System.out.println("LIST AFTER ADDING NODE AT START ");
                    list.show();
                    break;
                }
                case 3: {
                    System.out.println("Enter 3 ADD Node at Specific location ");
                    System.out.println("Enter The Index NUmber ");
                    int b = sc.nextInt();
                    System.out.println("Enter The Value to insert");
                    int z = sc.nextInt();
                    list.AnyLOC(b, z);
                    list.show();
                    break;
                }
                case 4:
                {
                    System.out.println("Enter 4  To Delete Node From Start or From any location ");
                    System.out.println("Enter The index No To delete that value ");
                    int b=sc.nextInt();
                    list.delete(b);
                    System.out.println("List after Deleting ");
                    list.show();
                    break;
                }
                case 5:
                    System.out.println("SHOW DATA ");
                    list.show();
                    break;
            }
        }while (input!=6);
        {
            System.out.println("THanks For Choosing Us BYE ....Khatam ");


        }
    }
}