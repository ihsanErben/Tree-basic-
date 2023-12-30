package W6;

import java.util.Scanner;

public class Main {                // is BST  ////////////

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        Tree x = new Tree();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("0 - exit");
            System.out.println("1 - add node");
            System.out.println("5 - search");
            System.out.println("7 - search min");
            System.out.println("9 - delete min");
            System.out.println("11 - preOrder");
            System.out.println("22 - inOrder");
            System.out.println("33 - postOrder");
            System.out.println("-1 - cloneTree");
            System.out.println("-2 - add random");
            System.out.print("choose an action: ");
            int action = input.nextInt();
            System.out.println("");
            switch (action) {
                case 0:
                    return;
                case 1:
                    System.out.print("New data: ");
                    int newData = input.nextInt();
                    x.add(newData);
                    break;

                case 5:
                    System.out.print("What is the data you are looking at: ");
                    int data1 = input.nextInt();
                    if (x.search(x.root, data1) == null) {
                        System.out.println("--- böyle bir eleman yok ---");
                        break;
                    } else {
                        System.out.println("The value you are looking for is avaliable in the system.");
                    }
                    break;
                case 7:
                    System.out.println("Min: " + x.searchMin().data);
                    break;
                case 9:
                    x.deleteMin();
                    break;
                case 11:
                    x.preOrder(x.root);
                    System.out.println();
                    break;
                case 22:
                    x.inOrder(x.root);
                    System.out.println();
                    break;
                case 33:
                    x.postOrder(x.root);
                    System.out.println();
                    break;
                case -2:
                    x.addRandom();
                    break;
                case -1:
                    x.cloneTree(x.root);
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
            System.out.println("--------------------------------------------------------------------");
        }

    }
}
