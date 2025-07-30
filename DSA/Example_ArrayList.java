package DSA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Example_ArrayList {
    int id;
    String name;

    public Example_ArrayList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<Example_ArrayList> al = new ArrayList<Example_ArrayList>();
        Scanner scn = new Scanner(System.in);
        int choice = 0;
        int noOfStudent = 0;

        do {
            System.out.println("1: add data");
            System.out.println("2: display data");
            System.out.println("3: exit");
            System.out.print("Enter choice: ");
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("How many data of student?");
                    noOfStudent = scn.nextInt();

                    for (int i = 0; i < noOfStudent; i++) {
                        System.out.println("Enter id and name:");
                        int id = scn.nextInt();
                        String name = scn.next();
                        al.add(new Example_ArrayList(id, name));
                    }
                    break;

                case 2:
                    for (Example_ArrayList s : al) {
                        System.out.println(s.id + " = " + s.name);
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 3);
    }
}